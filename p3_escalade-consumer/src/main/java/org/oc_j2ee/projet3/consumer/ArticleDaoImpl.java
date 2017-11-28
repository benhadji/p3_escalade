package org.oc_j2ee.projet3.consumer;
import org.oc_j2ee.projet3.model.Article;


import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

@Named
public class ArticleDaoImpl extends AbstractDaoImpl implements ArticleDao {
	
    PriseServeurJDBC prise;
    ResultSet resultats;
    
    public ArticleDaoImpl(PriseServeurJDBC prise) {
        this.prise = prise;
    }

	
	public void createArticle(Article article) throws ClassNotFoundException, IOException {
		
		String insert, titre, auteur;
		Integer numero;
		
		numero = article.getNumero();
		titre = article.getTitre();
		auteur = article.getAuteur();
		
        System.out.println("ArticleDAO creer");
        
        insert = "INSERT INTO ARTICLE VALUES (" + numero + ", " + titre + ", " + auteur + ")";
        
        prise.executeUpdate(insert);
		
	}
	
	
	public void readArticle(Article article) {
		
		int rowCount;
        String select;
        Vector<Object> ligne;

        select = "SELECT * FROM ARTICLE WHERE NUMERO = " + article.getNumero(); 
        resultats = prise.executeQuery(select);
        
        rowCount = (resultats.getRow()).size();				// a changer

        if (rowCount == 1) 
        {
            ligne = resultats.getRow().elementAt(0);		// a changer
            
            article.setTitre((String) ligne.elementAt(1));
            article.setAuteur((String) ligne.elementAt(2));
        }
        else
        {
            if (rowCount == 0) 
            {
                throw new IOException("Article " + article.getNumero() + " inconnu");
            }
            else 
            {
                throw new IOException("Clef " + article.getNumero() + " en double");
            }
        }

		
	}
	
	public int updateArticle(Article article) throws ClassNotFoundException, IOException {
		
		int rowCount;
        String update;

        Integer numero = article.getNumero();
        String titre = article.getTitre();
        String auteur = article.getAuteur();


        update = "UPDATE ARTICLE SET "
            + "TITRE = " + titre + ", "
            + "AUTEUR = " + auteur ;

        rowCount = prise.executeUpdate(update);

        return rowCount;
		
	}
	
	public int deleteArticle(Article article) throws ClassNotFoundException, IOException {
		
		int rowCount;
        String delete;

        Integer numero = article.getNumero();

        delete = "DELETE FROM ARTICLE WHERE NUMERO = " + numero;
        rowCount = prise.executeUpdate(delete);

        return rowCount;

		
	}
	
	

	
}
