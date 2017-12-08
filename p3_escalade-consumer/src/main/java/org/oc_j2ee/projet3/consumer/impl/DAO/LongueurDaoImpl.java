package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.LongueurDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.LongueurRM;
import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Voie;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class LongueurDaoImpl extends AbstractDaoImpl implements LongueurDAO {

    @Inject
    private LongueurRM longueurRM;


    @Override
    public void create(Longueur longueur) {

        String vSQL = "INSERT INTO LONGUEUR (nom, cotation, voie_id) VALUES(:nom, :cotation, :voie_id)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", longueur.getNom(), Types.VARCHAR);
        vParams.addValue("cotation", longueur.getCotation(), Types.VARCHAR);
        vParams.addValue("voie_id", longueur.getVoie_id());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void update(Longueur longueur) {

        String vSQL = "UPDATE LONGUEUR SET nom=:nom, cotation=:cotation, voie_id=:voie_id WHERE longueur_id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", longueur.getNom(), Types.VARCHAR);
        vParams.addValue("cotation", longueur.getCotation(), Types.VARCHAR);
        vParams.addValue("voie_id", longueur.getVoie_id());
        vParams.addValue("id", longueur.getId(), Types.INTEGER);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);



    }

    @Override
    public void delete(Longueur length) {

        String vSQL = "DELETE FROM LONGUEUR WHERE longueur_id=:id";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", length.getId(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void deleteAllByWay(Voie voie) {

        String vSQL = "DELETE FROM LONGUEUR WHERE voie_id=:voie_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("voie_id", voie.getVoie_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public Longueur getById(int id) {

        String vSQL = "SELECT * FROM LONGUEUR WHERE longueur_id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);
        try {
            Longueur longueur = vJdbcTemplate.queryForObject(vSQL, vParams, longueurRM);
            return longueur;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public List<Longueur> listLongueur(Voie voie) {

        String vSQL = "SELECT * FROM public.LONGUEUR WHERE longueur_id=:id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(voie);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        RowMapper<Longueur> vRowMapper = new LongueurRM();
        List<Longueur> vList = vJdbcTemplate.query(vSQL,vParams,vRowMapper);
        return vList;



    }
}
