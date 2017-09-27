/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;

/**
 *
 * @author IB
 */
@WebServlet(name = "DemarreJPAServlet", urlPatterns = {"/start_jpa"})
public class DemarreJPAServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Démarre framework JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        
        // Récup EM ( objet central qui controle la base )
        EntityManager em = emf.createEntityManager();

        // Démarre transaction
        em.getTransaction().begin();
        
        // Ajouter 3 films
        Film f = new Film();
        f.setTitre("Dracula");
        f.setAnneeProd(1999L);
        f.setDuree(90L);
        em.persist(f);
        
        f = new Film();
        f.setTitre("Nosferatu");
        f.setAnneeProd(1976L);
        f.setDuree(90L);
        em.persist(f);
        
        // Valide transaction
        em.getTransaction().commit();
    }

    
}
