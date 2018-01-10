package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.SiteDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.SiteRM;
import org.oc_j2ee.projet3.model.Site;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SiteDaoImpl extends AbstractDaoImpl implements SiteDAO {

    private SiteRM siteRM;

    public NamedParameterJdbcTemplate getNamedJdbcTemplate() {
        return namedJdbcTemplate;
    }

    public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
        this.namedJdbcTemplate = namedJdbcTemplate;
    }

    private NamedParameterJdbcTemplate namedJdbcTemplate;


    public SiteRM getSiteRM() {
        return siteRM;
    }
    public void setSiteRM(SiteRM siteRM) {
        this.siteRM = siteRM;
    }



    @Override
    public void create(Site site) {

        String vSQL = "INSERT INTO public.SITE (nom, localisation) VALUES(:nom, :localisation)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", site.getNom(), Types.VARCHAR);
        vParams.addValue("localisation", site.getLocalisation(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }



    @Override
    public void update(Site site) {

        String vSQL = "UPDATE public.SITE " +
                "SET nom=:nom, localisation=:localisation " +
                "WHERE site_id=:site_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();

        vParams.addValue("site_id", site.getSite_id(), Types.INTEGER);
        vParams.addValue("nom", site.getNom(), Types.VARCHAR);
        vParams.addValue("localisation", site.getLocalisation(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void delete(int site_id) {

        String vSQL = "DELETE FROM public.SITE WHERE site_id=:site_id";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("site_id", site_id, Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }



    @Override
    public Site getById(int site_id) {

        String vSQL = "SELECT * FROM public.SITE WHERE site_id = :site_id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("site_id", site_id);
        try {
            Site site = vJdbcTemplate.queryForObject(vSQL, vParams, siteRM);
            return site;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }


    }

    @Override
    public List<Site> getAllSites() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM site";

        List<Site> vList = vJdbcTemplate.query(sql,siteRM);
        return vList;


    }

    @Override
    public List<String> getAllSitesNames() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT nom FROM site";

        List<String> vList = vJdbcTemplate.queryForList(sql, String.class);
        return vList;
    }


}
