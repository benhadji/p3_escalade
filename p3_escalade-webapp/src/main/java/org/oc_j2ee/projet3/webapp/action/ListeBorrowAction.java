package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.BorrowManager;
import org.oc_j2ee.projet3.model.Borrow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListeBorrowAction extends ActionSupport implements SessionAware {

    private Borrow borrow;
    private BorrowManager borrowManager;
    private List<Borrow> borrows = new ArrayList<>();
    private Map<String, Object> session;

    public Map<String, Object> getSession() {
        return session;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    public BorrowManager getBorrowManager() {
        return borrowManager;
    }

    public void setBorrowManager(BorrowManager borrowManager) {
        this.borrowManager = borrowManager;
    }

    public List<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(List<Borrow> borrows) {
        this.borrows = borrows;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String execute(){
        borrows = borrowManager.getBorrowList();
        return "success";

    }
}
