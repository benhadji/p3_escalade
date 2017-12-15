package org.oc_j2ee.projet3.consumer.impl;


import org.oc_j2ee.projet3.consumer.contract.DAO.*;
import org.oc_j2ee.projet3.consumer.contract.DaoFactory;

public class DaoFactoryImpl implements DaoFactory{

    private ArticleDAO articleDAO;
    private CommentaireDAO commentaireDAO;
    private SiteDAO siteDAO;
    private TopoDAO topoDAO;
    private BorrowDAO borrowDAO;
    private LongueurDAO longueurDAO;
    private SecteurDAO secteurDAO;
    private VoieDAO voieDAO;
    private UtilisateurDAO utilisateurDAO;



    @Override
    public ArticleDAO getArticleDAO() {
        return articleDAO;
    }

    @Override
    public void setArticleDAO(ArticleDAO vArticleDAO) {
        articleDAO = vArticleDAO;
    }


    @Override
    public CommentaireDAO getCommentaireDAO() {
        return commentaireDAO;
    }

    @Override
    public void setCommentaireDAO(CommentaireDAO pCommentDao) {
        commentaireDAO = pCommentDao;
    }

    @Override
    public BorrowDAO getBorrowDAO() {
        return borrowDAO;
    }

    @Override
    public void setBorrowDAO(BorrowDAO vBorrowDAO) {
        borrowDAO = vBorrowDAO;
    }

    @Override
    public LongueurDAO getLongueurDAO() {
        return longueurDAO;
    }

    @Override
    public void setLongueurDAO(LongueurDAO vLongueurDAO) {
        longueurDAO = vLongueurDAO;
    }

    @Override
    public SecteurDAO getSecteurDAO() {
        return secteurDAO;
    }

    @Override
    public void setSecteurDAO(SecteurDAO vSecteurDAO) {
        secteurDAO = vSecteurDAO;
    }

    @Override
    public SiteDAO getSiteDAO() {
        return siteDAO;
    }

    @Override
    public void setSiteDAO(SiteDAO vSiteDAO) {
        siteDAO = vSiteDAO;
    }

    @Override
    public TopoDAO getTopoDAO() {
        return topoDAO;
    }

    @Override
    public void setTopoDAO(TopoDAO vTopoDAO) {
        topoDAO = vTopoDAO;
    }

    @Override
    public UtilisateurDAO getUtilisateurDAO() {
        return utilisateurDAO;
    }

    @Override
    public void setUtilisateurDAO(UtilisateurDAO vUtilisateurDAO) {
        utilisateurDAO = vUtilisateurDAO;
    }

    @Override
    public VoieDAO getVoieDAO() {
        return voieDAO;
    }

    @Override
    public void setVoieDAO(VoieDAO pVoieDAO) {
        voieDAO = pVoieDAO;
    }
}
