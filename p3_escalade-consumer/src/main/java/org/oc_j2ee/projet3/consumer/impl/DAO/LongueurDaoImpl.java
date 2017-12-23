package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.LongueurDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.LongueurRM;
import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class LongueurDaoImpl extends AbstractDaoImpl implements LongueurDAO {


    private LongueurRM longueurRM;

    public void setLongueurRM(LongueurRM longueurRM) {
        this.longueurRM = longueurRM;
    }


    @Override
    public void create(Longueur longueur) {

        String vSQL = "INSERT INTO public.LONGUEUR (voie_id, nom, cotation) " +
                "VALUES(:voie_id, :nom, :cotation)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("voie_id", longueur.getVoie_id(), Types.INTEGER);
        vParams.addValue("nom", longueur.getNom(), Types.VARCHAR);
        vParams.addValue("cotation", longueur.getCotation(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void update(Longueur longueur) {

        String vSQL = "UPDATE public.LONGUEUR " +
                "SET voie_id=:voie_id, nom=:nom, cotation=:cotation " +
                "WHERE longueur_id=:longueur_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();

        vParams.addValue("longueur_id", longueur.getLongueur_id(), Types.INTEGER);
        vParams.addValue("voie_id", longueur.getVoie_id());
        vParams.addValue("nom", longueur.getNom(), Types.VARCHAR);
        vParams.addValue("cotation", longueur.getCotation(), Types.VARCHAR);


        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);



    }

    @Override
    public void delete(Longueur longueur) {

        String vSQL = "DELETE FROM public.LONGUEUR WHERE longueur_id=:longeur_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();

        vParams.addValue("longueur_id", longueur.getLongueur_id(), Types.INTEGER);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void deleteAllByWay(Voie voie) {

        String vSQL = "DELETE FROM public.LONGUEUR WHERE voie_id=:voie_id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("voie_id", voie.getVoie_id(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public Longueur getById(int longueur_id) {

        String vSQL = "SELECT * FROM public.LONGUEUR WHERE longueur_id = :longueur_id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("longueur_id", longueur_id);
        try {
            Longueur longueur = vJdbcTemplate.queryForObject(vSQL, vParams, longueurRM);
            return longueur;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public List<Longueur> getByWay(Voie voie) {
        String vSQL = "SELECT * FROM public.LONGUEUR WHERE voie_id=:voie_id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(voie);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        List<Longueur> vList = vJdbcTemplate.query(vSQL,vParams,longueurRM);
        return vList;
    }

    @Override
    public List<Longueur> getBySite(Site site) {
        String vSQL = "SELECT DISTINCT * FROM longueur, voie, secteur, site " +
                "WHERE longueur.voie_id = voie.voie_id " +
                "AND voie.secteur_id=secteur.secteur_id " +
                "AND secteur.site_id=site.site_id and site.site_id=:site_id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(site);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        List<Longueur> vList = vJdbcTemplate.query(vSQL,vParams,longueurRM);
        return vList;
    }

    @Override
    public List<Longueur> getAllLongueur() {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        String sql = "SELECT * FROM public.longueur";
        List<Longueur> vList  = vJdbcTemplate.query(sql, new BeanPropertyRowMapper(Voie.class));

        return vList;
    }


}
