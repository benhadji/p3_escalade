package org.oc_j2ee.projet3.rest.resource;

import org.oc_j2ee.projet3.business.contrat.manager.ManagerFactory;

public abstract class AbstractResource {

    private static ManagerFactory managerFactory;


    public static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }
}
