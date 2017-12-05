package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.CommentaireDAO;
import org.oc_j2ee.projet3.model.Article;
import org.oc_j2ee.projet3.model.Commentaire;

import java.util.List;

public class CommentaireDaoImpl extends AbstractDaoImpl implements CommentaireDAO {


    @Override
    public void create(Commentaire comment) {




    }

    @Override
    public void update(Commentaire comment) {

    }

    @Override
    public void delete(Commentaire comment) {

    }

    @Override
    public void createCommentSite(int site_id, Commentaire comment) {

    }

    @Override
    public void deleteCommentSite(Commentaire comment) {

    }

    @Override
    public Commentaire getById(int id) {
        return null;
    }

    @Override
    public List<Commentaire> getAllByArticle(Article article) {
        return null;
    }
}
