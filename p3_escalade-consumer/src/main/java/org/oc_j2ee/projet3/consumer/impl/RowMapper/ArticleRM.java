package org.oc_j2ee.projet3.consumer.impl.RowMapper;

import org.oc_j2ee.projet3.model.Article;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleRM extends AbstractRM implements RowMapper<Article>{
    @Override
    public Article mapRow(ResultSet rs, int i) throws SQLException {

        Article article = new Article();
        article.setNumero(rs.getInt("id"));
        article.setTitre(rs.getString("titre"));
        article.setAuteur(rs.getString("auteur"));

        return article;

    }
}
