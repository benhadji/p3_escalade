package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

    private String successmessage, errormessage;

    public String getSuccessmessage() {
        return successmessage;
    }

    public void setSuccessmessage(String succesmessage) {
        this.successmessage = succesmessage;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public String execute(){

        return "success";

    }


}
