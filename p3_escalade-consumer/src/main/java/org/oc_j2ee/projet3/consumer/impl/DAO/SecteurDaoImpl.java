package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.SecteurDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.LongueurRM;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.SecteurRM;
import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class SecteurDaoImpl extends AbstractDaoImpl implements SecteurDAO {


    @Inject
    private SecteurRM secteurRM;

    @Override
    public void create(Secteur secteur) {

        String vSQL = "INSERT INTO SECTEUR (nom, site_id) VALUES(:nom, :site_id)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", secteur.getNom(), Types.VARCHAR);
        vParams.addValue("site_id", secteur.getSite_id());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void update(Secteur secteur) {

        String vSQL = "UPDATE SECTEUR SET nom=:nom, site_id=:site_id WHERE secteur_id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", secteur.getNom(), Types.VARCHAR);
        vParams.addValue("site_id", secteur.getSite_id());
        vParams.addValue("id", secteur.getSecteur_id(), Types.INTEGER);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public void delete(Secteur secteur) {

        String vSQL = "DELETE FROM SECTEUR WHERE secteur_id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", secteur.getSecteur_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void deleteAllBySite(Site site) {

        String vSQL = "DELETE FROM SECTEUR WHERE site_id=:site_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("site_id", site.getSite_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public Secteur getById(int id) {

        String vSQL = "SELECT * FROM SECTEUR WHERE id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);
        try {
            Secteur secteur = vJdbcTemplate.queryForObject(vSQL, vParams, secteurRM);
            return secteur;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public List<Secteur> getAllBySite(Site site) {


        String vSQL = "SELECT * FROM public.SECTEUR WHERE secteur_id=:id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(site);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        RowMapper<Secteur> vRowMapper = new SecteurRM();
        List<Secteur> vList = vJdbcTemplate.query(vSQL,vParams,vRowMapper);
        return vList;


    }
}
