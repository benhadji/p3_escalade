package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Article;

import java.sql.SQLException;
import java.util.List;

public interface ArticleManager {

    Article getById(Integer id) throws SQLException;
    List<Article> getListArticle();
}
