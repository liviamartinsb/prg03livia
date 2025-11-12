/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.utils;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Lívia Martins Bastos
 */
public class JPAUtil {
  
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("CursoPU");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
}
}
