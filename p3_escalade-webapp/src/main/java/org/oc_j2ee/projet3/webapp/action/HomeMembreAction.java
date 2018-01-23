package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class HomeMembreAction extends ActionSupport implements SessionAware{

    private Map<String, Object> session;
    private String successmessage;


    public String getSuccessmessage() {
        return successmessage;
    }

    public void setSuccessmessage(String successmessage) {
        this.successmessage = successmessage;
    }



    @Override
    public void setSession(Map<String, Object> session) {

        this.session = session;
    }

    public String execute(){
        if (!session.containsKey("sessionUtilisateur")) {
            return ERROR;
        } else {
            return SUCCESS;
        }

    }
}
