package org.oc_j2ee.projet3.business.contrat.manager;

public interface ManagerFactory {

    ArticleManager getArticleManager();
    void setArticleManager(ArticleManager articleManager);

    CommentaireManager getCommentaireManager();
    void setCommentaireManager(CommentaireManager commentaireManager);

    SiteManager getSiteManager();
    void setSiteManager(SiteManager siteManager);

    UtilisateurManager getUtilisateurManager();
    void setUtilisateurManager(UtilisateurManager utilisateurManager);

    TopoManager getTopoManager();
    void setTopoManager(TopoManager topoManager);

    BorrowManager getBorrowManager();
    void setBorrowManager(BorrowManager borrowManager);


}
