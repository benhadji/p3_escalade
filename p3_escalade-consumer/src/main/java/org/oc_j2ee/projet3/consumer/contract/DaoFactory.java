package org.oc_j2ee.projet3.consumer.contract;

import org.oc_j2ee.projet3.consumer.contract.DAO.*;

public interface DaoFactory {

    ArticleDAO getArticleDAO();
    void setArticleDAO(ArticleDAO vArticleDAO);

    CommentaireDAO getCommentaireDAO();
    void setCommentDao(CommentaireDAO pCommentDao);

    BorrowDAO getBorrowDAO();
    void setBorrowDAO(BorrowDAO vBorrowDAO);

    LongueurDAO getLongueurDAO();
    void setLongueurDAO(LongueurDAO vLongueurDAO);

    SecteurDAO getSecteurDAO();
    void setSecteurDAO(SecteurDAO vSecteurDAO);

    SiteDAO getSiteDAO();
    void setSiteDAO(SiteDAO vSiteDAO);

    TopoDAO getTopoDAO();
    void setTopoDAO(TopoDAO vTopoDAO);

    UtilisateurDAO getUtilisateurDAO();
    void setUtilisateurDAO(UtilisateurDAO vUtilisateurDAO);

    VoieDAO getVoieDAO();
    void setVoieDAO(VoieDAO pVoieDAO);




}
