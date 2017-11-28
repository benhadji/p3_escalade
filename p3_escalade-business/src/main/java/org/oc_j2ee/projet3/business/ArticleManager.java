package org.oc_j2ee.projet3.business;

import org.oc_j2ee.projet3.model.Article;

import java.util.List;

public class ArticleManager {

	
	public Article getById(Integer id) {
		
		if (id < 1) {
            throw new NotFoundException("Article " + id + " non trouvé !");
        }
		
		Article article = new Article();
        vProjet.setNom("Projet n°" + pId);
        return vProjet;
		

	}
	
	public List<Article> getAllArticlesByAuthor(Integer authorId){
		return null;
	}
	
	public List<Article> getListArticle() {
		
	}

}
