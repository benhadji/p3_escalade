package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.ArticleDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.ArticleRM;
import org.oc_j2ee.projet3.model.Article;
import org.oc_j2ee.projet3.model.Utilisateur;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class ArticleDaoImpl extends AbstractDaoImpl implements ArticleDAO {

    @Inject
    private ArticleRM articleRM;



    @Override
    public void create(Article article) {


        String vSQL = "INSERT INTO ARTICLE (titre, auteur) " +
                "VALUES(:titre, :auteur)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("titre", article.getTitre(), Types.VARCHAR);
        vParams.addValue("auteur", article.getAuteur(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void update(Article article) {

        String vSQL = "UPDATE ARTICLE SET titre=:titre, auteur=:auteur, WHERE comment_id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("titre", article.getTitre(), Types.VARCHAR);
        vParams.addValue("auteur", article.getAuteur(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public void delete(Article article) {

        String vSQL = "DELETE FROM ARTICLE WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", article.getNumero(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public Article getById(int id) {

        String vSQL = "SELECT * FROM ARTICLE WHERE id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);
        try {
            Article article = vJdbcTemplate.queryForObject(vSQL, vParams, articleRM);
            return article;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }


    }

    @Override
    public List<Article> getAllByUser(Utilisateur utilisateur) {

        String vSQL = "SELECT * FROM public.ARTICLE WHERE id=:id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(utilisateur);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        RowMapper<Article> vRowMapper = new ArticleRM();
        List<Article> vList = vJdbcTemplate.query(vSQL,vParams,vRowMapper);
        return vList;


    }
}
