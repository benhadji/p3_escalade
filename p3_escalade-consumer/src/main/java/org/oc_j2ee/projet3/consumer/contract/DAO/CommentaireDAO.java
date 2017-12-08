package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Article;
import org.oc_j2ee.projet3.model.Commentaire;
import org.oc_j2ee.projet3.model.Site;

import java.util.List;

public interface CommentaireDAO {

    void create(Commentaire comment);
    void update(Commentaire comment);
    void delete(Commentaire comment);
    Commentaire getById(int id);
    List<Commentaire> getAllByArticle(Article article);


}
