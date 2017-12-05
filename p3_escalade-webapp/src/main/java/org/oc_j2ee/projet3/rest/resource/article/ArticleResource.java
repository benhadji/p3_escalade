package org.oc_j2ee.projet3.rest.resource.article;

import javassist.NotFoundException;

import org.oc_j2ee.projet3.business.contrat.manager.ArticleManager;
import org.oc_j2ee.projet3.model.Article;
import org.oc_j2ee.projet3.rest.resource.AbstractResource;

import java.sql.SQLException;
import java.util.List;

public class ArticleResource extends AbstractResource {


    public Article get(Integer pId) throws NotFoundException, SQLException {

        ArticleManager vArticleManager = getManagerFactory().getArticleManager();
        Article article = vArticleManager.getById(pId);
        return article;
    }


    public List<Article> get() {
        ArticleManager vArticleManager = getManagerFactory().getArticleManager();
        List<Article> vListArticle = vArticleManager.getListArticle();
        return vListArticle;
    }





}
