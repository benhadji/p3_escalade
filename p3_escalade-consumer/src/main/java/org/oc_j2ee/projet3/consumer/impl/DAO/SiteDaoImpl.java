package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.SiteDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.LongueurRM;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.SiteRM;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class SiteDaoImpl extends AbstractDaoImpl implements SiteDAO {

    @Inject
    private SiteRM siteRM;


    @Override
    public void create(Site site) {

        String vSQL = "INSERT INTO SITE (nom, localisation, topo_id) VALUES(:nom, :localisation, :site_id)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", site.getNom(), Types.VARCHAR);
        vParams.addValue("topo_id", site.getTopo_id());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }



    @Override
    public void update(Site site) {

        String vSQL = "UPDATE SITE SET nom=:nom, localisation=:localisation, topo_id=:topo_id WHERE site_id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", site.getNom(), Types.VARCHAR);
        vParams.addValue("localisation", site.getLocalisation(), Types.VARCHAR);
        vParams.addValue("topo_id", site.getTopo_id(), Types.INTEGER);
        vParams.addValue("id", site.getSite_id(), Types.INTEGER);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public void delete(int id) {

        String vSQL = "DELETE FROM SITE WHERE site_id=:id";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", id, Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public void deleteSiteTopo(Site site) {

        String vSQL = "DELETE FROM SITE WHERE site_id=:site_id AND topo_id=:topo_id";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("site_id", site.getSite_id(), Types.INTEGER);
        vParams.addValue("topo_id", site.getTopo_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public Site getById(int id) {

        String vSQL = "SELECT * FROM SITE WHERE site_id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);
        try {
            Site site = vJdbcTemplate.queryForObject(vSQL, vParams, siteRM);
            return site;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }


    }

    @Override
    public List<Site> getAllSites() {
        return null;
    }

    @Override
    public List<Site> getAllByTopo(Topo topo) {

        String vSQL = "SELECT * FROM public.SITE WHERE site_id=:id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(topo);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        RowMapper<Site> vRowMapper = new SiteRM();
        List<Site> vList = vJdbcTemplate.query(vSQL,vParams,vRowMapper);
        return vList;


    }

    @Override
    public void createSiteTopo(Site site, Topo topo) {



    }
}
