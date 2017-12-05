package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Commentaire;
import java.util.List;

public interface CommentaireManager {

    void addComment(Commentaire comment);
    Commentaire getComment(int id);
    List<Commentaire> getListComments(List<Commentaire> comments);
    void editComment(int idComment);
    void deleteComment(Commentaire comment);

}
