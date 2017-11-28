package org.oc_j2ee.projet3.consumer;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.ResultSet;



public class PriseServeurJDBC 
{
    private final String nomMachine;
    private final int port;
    private String formatDate;
    private String select, requete;
    private Socket connection;
    private ObjectInputStream entree;
    private ObjectOutputStream sortie;


    
    public PriseServeurJDBC (String nomMachine, int port)
    {
        this.nomMachine = nomMachine;
        this.port = port;
    }
    
    public void setFormatDate(String formatDate)
    {
        this.formatDate = formatDate;
    }
    
    public String getFormatDate()
    {
        return formatDate;
    }
    
    public Socket getConnection() throws IOException
    {        
        connection = new Socket(nomMachine, port);
        return connection;  
    }
    
    public void closeConnection() throws IOException
    {
        if(connection!=null)
        {
            connection.close(); 
        }
    }
    

    public ResultSet executeQuery(String select) throws IOException, ClassNotFoundException
    {
        String erreur;
        ResultSet resultat;
        this.select = select;
        
        getConnection();
        
        sortie = new ObjectOutputStream(connection.getOutputStream());
        entree = new ObjectInputStream(connection.getInputStream());
        
        sortie.writeObject(select);
        
        if((Integer)entree.readObject() == 1)
        {
            resultat = (ResultSet)entree.readObject();
        }
        else
        {
            erreur = (String)entree.readObject();
            throw new ClassNotFoundException(erreur);
        }
            
        
        entree.close();
        sortie.close();
        closeConnection();
        
        return resultat;
    }

    
    
    
    public Integer executeUpdate(String requete) throws IOException, ClassNotFoundException
    {    
        String erreur;
        Integer update;
        getConnection();
        this.requete = requete;
        sortie = new ObjectOutputStream(connection.getOutputStream());
        entree = new ObjectInputStream(connection.getInputStream());
        
        sortie.writeObject(requete);
        
        if((Integer)entree.readObject() == 2)
        {
            update = (Integer) entree.readObject();
        }
        else
        {
            erreur = (String)entree.readObject();
            throw new ClassNotFoundException(erreur);
        }
            
        
        entree.close();
        sortie.close();
        closeConnection();
        
        
        return update;
    }

    
    
    
}
