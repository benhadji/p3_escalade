package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Article;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface ArticleDAO {

    void create(Article article);
    void update(Article article);
    void delete(Article article);
    Article getById(int id);
    List<Article> getAllByUser(Utilisateur utilisateur);

}
