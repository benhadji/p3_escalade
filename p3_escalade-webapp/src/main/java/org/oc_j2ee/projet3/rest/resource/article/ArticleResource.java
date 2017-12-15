package org.oc_j2ee.projet3.rest.resource.article;


import org.oc_j2ee.projet3.business.contrat.manager.ArticleManager;
import org.oc_j2ee.projet3.model.Article;
import org.oc_j2ee.projet3.rest.resource.AbstractResource;

import java.sql.SQLException;
import java.util.List;

public class ArticleResource extends AbstractResource {


    public Article get(Integer pId) throws SQLException {


        ArticleManager articleManager = getManagerFactory().getArticleManager();
        Article article = articleManager.getById(pId);
        return article;


    }

    public List<Article> getList(){

        ArticleManager articleManager = getManagerFactory().getArticleManager();
        List<Article> vList = articleManager.getListArticle();

        return vList;

    }





}
