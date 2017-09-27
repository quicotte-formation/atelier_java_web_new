/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Film;

/**
 *
 * @author IB
 */
public class FilmService {

    public void supprimerFilm(long id){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        
        em.createQuery("DELETE FROM Film f WHERE f.id=:filmId")
                .setParameter("filmId", id)
                .executeUpdate();
        
//        Film f = em.find(Film.class, id);// SELECT f.* FROM Film f WHERE id=123
//        em.remove(f);// DELETE FROM film WHERE id=123
        
        em.getTransaction().commit();
    }
    
    public List<Film> listerFilms(){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT f FROM Film f ORDER BY f.titre");
        List<Film> films = query.getResultList();
        
        return films;
    }

    public void creerFilm(Film f) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist( f );
        em.getTransaction().commit();
    }

}
