package org.oc_j2ee.projet3.consumer.impl.RowMapper;


import org.oc_j2ee.projet3.model.Commentaire;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentaireRM extends AbstractRM implements RowMapper<Commentaire> {
    @Override
    public Commentaire mapRow(ResultSet rs, int i) throws SQLException {

        Commentaire commentaire = new Commentaire();
        commentaire.setId(rs.getInt("article_id"));
        commentaire.setContent(rs.getString("content"));

        ArticleRM articleRM = new ArticleRM();
        commentaire.setArticle(articleRM.mapRow(rs,i));

        UtilisateurRM utilisateurRM = new UtilisateurRM();
        commentaire.setUtilisateur(utilisateurRM.mapRow(rs,i));

        return commentaire;
    }
}
