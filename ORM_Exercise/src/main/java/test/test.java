/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author coej
 */
public class test {

    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("com.mycompany_JPAEntityMappings1_jar_1.0-SNAPSHOTPU");
        EntityManager em = emfactory.createEntityManager();
        Customer c;
    }
}
