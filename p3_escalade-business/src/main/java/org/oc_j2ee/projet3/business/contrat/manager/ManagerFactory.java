package org.oc_j2ee.projet3.business.contrat.manager;

public interface ManagerFactory {

    ArticleManager getArticleManager();
    void setArticleManager(ArticleManager vArticleManager);

    CommentaireManager getCommentaireManager();
    void setCommentaireManager(CommentaireManager vCommentaireManager);

    SiteManager getSiteManager();
    void setSiteManager(SiteManager vSiteManager);

    UtilisateurManager getUtilisateurManager();
    void setUtilisateurManager(UtilisateurManager vUserManager);

    TopoManager getTopoManager();
    void setTopoManager(TopoManager topoManager);

    BorrowManager getBorrowManager();
    void setBorrowManager(BorrowManager borrowManager);


}
