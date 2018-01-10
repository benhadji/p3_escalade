package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.SecteurDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.LongueurRM;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.SecteurRM;
import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
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

        String vSQL = "INSERT INTO public.SECTEUR (site_id, nom) VALUES(:site_id, :nom)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("site_id", secteur.getSite_id(), Types.INTEGER);
        vParams.addValue("nom", secteur.getNom(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);



    }

    @Override
    public void update(Secteur secteur) {

        String vSQL = "UPDATE public.SECTEUR SET site_id=:site_id, nom=:nom WHERE secteur_id=:secteur_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("secteur_id", secteur.getSecteur_id(), Types.INTEGER);
        vParams.addValue("site_id", secteur.getSite_id(), Types.INTEGER);
        vParams.addValue("nom", secteur.getNom(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public void delete(Secteur secteur) {

        String vSQL = "DELETE FROM public.SECTEUR WHERE secteur_id=:secteur_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("secteur_id", secteur.getSecteur_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void deleteAllBySite(Site site) {

        String vSQL = "DELETE FROM public.SECTEUR WHERE site_id=:site_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("site_id", site.getSite_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public Secteur getById(int secteur_id) {

        String vSQL = "SELECT * FROM public.secteur WHERE secteur_id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("secteur_id", secteur_id);
        try {
            Secteur secteur = vJdbcTemplate.queryForObject(vSQL, vParams, secteurRM);
            return secteur;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public List<Secteur> getAllBySite(Site site) {

        String vSQL = "SELECT * FROM public.secteur WHERE site_id=:site_id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(site);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        List<Secteur> vList = vJdbcTemplate.query(vSQL,vParams,secteurRM);
        return vList;

    }

    @Override
    public List<Secteur> getAllSecteurs() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM secteur";

        List<Secteur> vList = vJdbcTemplate.query(sql,secteurRM);
        return vList;

    }

    public void setSecteurRM(SecteurRM secteurRM) {
        this.secteurRM = secteurRM;
    }

    public SecteurRM getSecteurRM() {
        return secteurRM;
    }
}
