package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.VoieDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.VoieRM;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Voie;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class VoieDaoImpl extends AbstractDaoImpl implements VoieDAO {

    @Inject
    private VoieRM voieRM;


    @Override
    public void create(Voie voie) {

        String vSQL = "INSERT INTO public.VOIE (secteur_id, nom, etat) " +
                "VALUES(:secteur_id, :nom, :etat)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("secteur_id", voie.getSecteur_id(), Types.INTEGER);
        vParams.addValue("nom", voie.getNom(), Types.VARCHAR);
        vParams.addValue("etat", voie.isEtat(), Types.BOOLEAN);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public void update(Voie voie) {

        String vSQL = "UPDATE public.VOIE " +
                "SET secteur_id=:secteur_id, nom=:nom, etat=:etat " +
                "WHERE voie_id=:voie_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("voie_id", voie.getVoie_id(), Types.INTEGER);
        vParams.addValue("secteur_id", voie.getSecteur_id(), Types.INTEGER);
        vParams.addValue("nom", voie.getNom(), Types.VARCHAR);
        vParams.addValue("etat", voie.isEtat(), Types.BOOLEAN);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void delete(Voie voie) {


        String vSQL = "DELETE FROM public.VOIE WHERE voie_id=:voie_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("voie_id", voie.getVoie_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void deleteAllBySector(Secteur secteur) {

        String vSQL = "DELETE FROM public.VOIE WHERE secteur_id=:secteur_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("secteur_id", secteur.getSecteur_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public Voie getById(int voie_id) {

        String vSQL = "SELECT * FROM public.VOIE WHERE voie_id=:voie_id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("voie_id", voie_id);
        try {
            Voie voie = vJdbcTemplate.queryForObject(vSQL, vParams, voieRM);
            return voie;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }


    }

    @Override
    public List<Voie> getAllBySector(Secteur secteur) {

        String vSQL = "SELECT * FROM public.VOIE WHERE secteur_id=:secteur_id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(secteur);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        List<Voie> vList = vJdbcTemplate.query(vSQL,vParams,voieRM);
        return vList;
    }

    @Override
    public List<Voie> getListVoie() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM public.VOIE";

        List<Voie> vList  = vJdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Voie.class));

        return vList;

    }
}
