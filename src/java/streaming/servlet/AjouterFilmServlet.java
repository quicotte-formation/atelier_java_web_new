/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author IB
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/add_film"})
public class AjouterFilmServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // Form binding sur form => objet
        Film f = new Film();
        f.setTitre( req.getParameter("titre") );
        f.setDuree( Long.parseLong(req.getParameter("duree")) );
        f.setAnneeProd( Long.parseLong( req.getParameter("anneeProd") ) );
        
        // Persistence du nouveau film
        FilmService service = new FilmService();
        service.creerFilm(f);
        
        // Forward vers liste films
        resp.sendRedirect("http://google.fr");
//        req.getRequestDispatcher("lister_films").forward(req, resp);
    }

    
}
