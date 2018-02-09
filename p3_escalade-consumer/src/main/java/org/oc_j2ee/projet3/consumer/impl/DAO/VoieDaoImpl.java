package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.VoieDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.VoieRM;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
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

    public void setVoieRM(VoieRM voieRM) {
        this.voieRM = voieRM;
    }
    public VoieRM getVoieRM() {
        return voieRM;
    }


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

        String vSQL = "SELECT * FROM public.voie WHERE secteur_id=:secteur_id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(secteur);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        List<Voie> vList = vJdbcTemplate.query(vSQL,vParams,voieRM);
        return vList;


    }

    @Override
    public List<Voie> getListVoie() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM public.voie";
        List<Voie> vList  = vJdbcTemplate.query(sql, voieRM);
        return vList;


    }


    @Override
    public List<Voie> getByName(String nom) {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String var = "'"+nom+"'";
        String vSQL = "SELECT * FROM voie WHERE nom = "+var;

        try {
            List<Voie> voies = vJdbcTemplate.query(vSQL,voieRM);
            return voies;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }


    }

}
