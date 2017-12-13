package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.*;


public class ManagerFactoryImpl implements ManagerFactory {

    private ArticleManager articleManager;
    private CommentaireManager commentaireManager;
    private SiteManager siteManager;
    private UtilisateurManager utilisateurManager;
    private TopoManager topoManager;
    private BorrowManager borrowManager;

    @Override
    public ArticleManager getArticleManager() {
        return this.articleManager;
    }

    @Override
    public void setArticleManager(ArticleManager vArticleManager) {
        articleManager = vArticleManager;
    }

    @Override
    public CommentaireManager getCommentaireManager() {
        return this.commentaireManager ;
    }

    @Override
    public void setCommentaireManager(CommentaireManager vCommentaireManager) {
        commentaireManager = vCommentaireManager;
    }

    @Override
    public SiteManager getSiteManager() {
        return siteManager;
    }

    @Override
    public void setSiteManager(SiteManager vSiteManager) {
        siteManager = vSiteManager;
    }

    @Override
    public UtilisateurManager getUtilisateurManager() {
        return utilisateurManager;
    }

    @Override
    public void setUtilisateurManager(UtilisateurManager vUserManager) {
        utilisateurManager = vUserManager;
    }


    @Override
    public TopoManager getTopoManager() {
        return topoManager;
    }

    @Override
    public void setTopoManager(TopoManager vTopoManager) {
        this.topoManager = vTopoManager;
    }

    @Override
    public BorrowManager getBorrowManager() {
        return borrowManager;
    }

    @Override
    public void setBorrowManager(BorrowManager vBorrowManager) {
        this.borrowManager = vBorrowManager;
    }



}





