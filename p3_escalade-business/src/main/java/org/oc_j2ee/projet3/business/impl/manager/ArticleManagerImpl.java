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

        return getDaoFactory().getArticleDAO().getById(id);

    }


    @Override
    public List<Article> getListArticle() {

        return getDaoFactory().getArticleDAO().getAllArticle();

    }

}
