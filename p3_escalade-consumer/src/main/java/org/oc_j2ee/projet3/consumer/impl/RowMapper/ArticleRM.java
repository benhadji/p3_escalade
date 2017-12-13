package org.oc_j2ee.projet3.consumer.impl.RowMapper;

import org.oc_j2ee.projet3.model.Article;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleRM implements RowMapper<Article>{
    @Override
    public Article mapRow(ResultSet rs, int i) throws SQLException {

        Article article = new Article();
        article.setId(rs.getInt("id"));
        article.setUtilisateur_id(rs.getInt("utilisateur_id"));
        article.setTitre(rs.getString("titre"));
        article.setAuteur(rs.getString("auteur"));

        return article;

    }
}
