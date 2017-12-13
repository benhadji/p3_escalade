package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.CommentaireDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.CommentaireRM;
import org.oc_j2ee.projet3.model.Article;
import org.oc_j2ee.projet3.model.Commentaire;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.inject.Inject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

public class CommentaireDaoImpl extends AbstractDaoImpl implements CommentaireDAO {

    @Inject
    private CommentaireRM commentaireRM;


    public void setCommentaireRM(CommentaireRM commentaireRM) {
        this.commentaireRM = commentaireRM;
    }


    @Override
    public void create(Commentaire commentaire) {


        String vSQL = "INSERT INTO public.COMMENTAIRE(article_id, utilisateur_id, auteur, contenu) " +
                "VALUES(:article_id, :utilisateur_id, :auteur, :contenu)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("article_id", commentaire.getArticleId(), Types.INTEGER);
        vParams.addValue("utilisateur_id", commentaire.getUtilisateurId(), Types.INTEGER);
        vParams.addValue("auteur", commentaire.getAuteur(), Types.VARCHAR);
        vParams.addValue("contenu", commentaire.getContent(), Types.LONGVARCHAR);


        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }


    @Override
    public void update(Commentaire commentaire) {


        String vSQL = "UPDATE public.COMMENTAIRE " +
                "SET article_id=:article_id, utilisateur_id=:utilisateur_id, auteur=:auteur, contenu=:contenu " +
                "WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();

        vParams.addValue("id", commentaire.getId(), Types.INTEGER);
        vParams.addValue("article_id", commentaire.getArticleId(), Types.INTEGER);
        vParams.addValue("utilisateur_id", commentaire.getUtilisateurId(), Types.INTEGER);
        vParams.addValue("auteur", commentaire.getAuteur(), Types.VARCHAR);
        vParams.addValue("contenu", commentaire.getContent(), Types.LONGVARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);


    }

    @Override
    public void delete(Commentaire commentaire) {

        String vSQL = "DELETE FROM public.COMMENTAIRE WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", commentaire.getId(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }


    @Override
    public Commentaire getById(int id) {

        String vSQL = "SELECT * FROM public.COMMENTAIRE WHERE id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);
        try {
            Commentaire commentaire = vJdbcTemplate.queryForObject(vSQL, vParams, commentaireRM);
            return commentaire;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }

    }

    @Override
    public List<Commentaire> getAllByArticle(Article article) {

        String vSQL = "SELECT * FROM public.COMMENTAIRE WHERE article_id=:id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(article);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        List<Commentaire> vList = vJdbcTemplate.query(vSQL,vParams,commentaireRM);
        return vList;


    }




}


