package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.CommentaireManager;
import org.oc_j2ee.projet3.model.Commentaire;

import javax.inject.Named;
import java.util.List;

@Named
public class CommentaireManagerImpl extends AbstractManagerImpl implements CommentaireManager {
    @Override
    public void addComment(Commentaire comment) {

    }

    @Override
    public Commentaire getComment(int id) {
        return null;
    }

    @Override
    public List<Commentaire> getListComments(List<Commentaire> comments) {
        return null;
    }

    @Override
    public void editComment(int idComment) {

    }

    @Override
    public void deleteComment(Commentaire comment) {

    }
}
