package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.ArticleDAO;
import org.oc_j2ee.projet3.model.Article;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public class ArticleDaoImpl extends AbstractDaoImpl implements ArticleDAO {
    @Override
    public void create(Article article) {

    }

    @Override
    public void update(Article article) {

    }

    @Override
    public void delete(Article article) {

    }

    @Override
    public Article getById(int id) {
        return null;
    }

    @Override
    public List<Article> getAllByUser(Utilisateur utilisateur) {
        return null;
    }
}
