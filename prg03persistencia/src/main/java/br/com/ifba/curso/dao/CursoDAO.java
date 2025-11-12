/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;
import javax.persistence.EntityManager;
import java.util.List;
import br.com.ifba.curso.entity.Curso; 
import br.com.ifba.utils.JPAUtil;
/**
 *
 * @author Lívia Martins Bastos
 */

public class CursoDAO {
 public List<Curso> findAll() {
    EntityManager em = JPAUtil.getEntityManager();
    
    List<Curso> cursos = null; 

    em.getTransaction().begin(); 

    try {
        cursos = em.createQuery("SELECT c FROM Curso c", Curso.class).getResultList();
        
        em.getTransaction().commit(); 
        
        return cursos; 
    } catch (Exception e) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        e.printStackTrace();
        return null; 
    } finally {
        if (em != null && em.isOpen()) {
            em.close(); 
        }
    }
}
}
