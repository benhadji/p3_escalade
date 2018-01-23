package org.oc_j2ee.projet3.webapp.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.oc_j2ee.projet3.model.Utilisateur;


import java.util.Map;

public class AuthenticationInterceptor implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        if(session != null && session.containsKey("sessionUtilisateur"))
        {
            Utilisateur utilisateur = (Utilisateur) session.get("sessionUtilisateur");
            if(utilisateur==null){
                return Action.LOGIN;
            }else{
                Action action = (Action) actionInvocation.getAction();
                return actionInvocation.invoke();
            }
        }else{
            return Action.LOGIN;
        }




    }
}
