package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.UtilisateurManager;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.Map;

public class LogInAction extends ActionSupport implements SessionAware {

    private Utilisateur utilisateur;
    private UtilisateurManager utilisateurManager;
    private String email;
    private String password;
    private Map session;
    private String message;
    private String successmessage, errormessage;


    public String getSuccessmessage() {
        return successmessage;
    }

    public void setSuccessmessage(String successmessage) {
        this.successmessage = successmessage;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }




    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }



    public UtilisateurManager getUtilisateurManager() {
        return utilisateurManager;
    }

    public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
        this.utilisateurManager = utilisateurManager;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }


    public String execute()
    {
        if(!session.containsKey("sessionUtilisateur"))
        {
            if(email!=null)
            {
                utilisateur = utilisateurManager.getLoginUser(this.email);
                if(utilisateur!=null && utilisateurManager.validateLogin(utilisateur,this.password))
                {
                    session.put("sessionUtilisateur", getUtilisateur());

                    return SUCCESS;
                }else{
                    setErrormessage("Email/Mot de passe incorrect");
                    return ERROR;
                }
            }else{
                return INPUT;
            }
        }else{
            return SUCCESS;
        }
    }

    public void validate()
    {
        if(this.email!=null)
        {
            if(this.email.equals("")) {
                addFieldError("email", "Le login est obligatoire");
            }
            if(!this.email.equals("") && this.email.length() <=2)
            {
                addFieldError("email", "Le login doit faire plus de deux caractères");
            }
        }
        if(this.password!=null)
        {
            if(this.password.equals(""))
            {
                addFieldError("password", "Le mot de passe ne peut être vide");
            }
            if(!this.password.equals("") && this.password.length()<5){
                addFieldError("password", "Le  mot de passe ne doit pas faire moins de cinq caractères");
            }
        }
    }


}

