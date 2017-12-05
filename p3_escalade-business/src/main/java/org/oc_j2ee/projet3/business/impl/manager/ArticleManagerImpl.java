package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.ArticleManager;
import org.oc_j2ee.projet3.model.Article;

import javax.inject.Named;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Named
public class ArticleManagerImpl extends AbstractManagerImpl implements ArticleManager  {

    @Override
    public Article getById(Integer id) throws SQLException {

        if (id < 1) {
            throw new SQLException("Article " + id + " non trouvé !");
        }

        Article article = new Article();
        article.setNumero(id);
        return article;

    }


    @Override
    public List<Article> getListArticle() {

        List<Article> vList = new ArrayList<>();
        for (int i = 0; i < 10 ; i++)
        {
            Article article = new Article();
            article.setNumero(i);
            vList.add(article);
        }

        return vList;
    }

}
