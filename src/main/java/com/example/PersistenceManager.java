/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static jdk.nashorn.internal.runtime.Context.DEBUG;

/**
 *
 * @author USER
 */
public class PersistenceManager {

    private static final PersistenceManager singleton = new PersistenceManager();
    protected EntityManagerFactory emf;

    public static PersistenceManager getInstance() {
        return singleton;
    }

    private PersistenceManager() {
    }

    public EntityManagerFactory getEntityManagerFactory() {

        if (emf == null) {
            createEntityManagerFactorry();
        }
        return emf;
    }

    protected void createEntityManagerFactorry() {
        this.emf = Persistence.createEntityManagerFactory("CompetitorsPU", System.getProperties());
        if (DEBUG) {
            System.out.println("Persistence started at " + new java.util.Date());
        }
    }

    public void closeEntityManagerFactory() {
        if (emf == null) {
            emf.close();
            emf = null;
            if (DEBUG) {
                System.out.println("Persistence finished at " + new java.util.Date());
            }
        }
    }

}
