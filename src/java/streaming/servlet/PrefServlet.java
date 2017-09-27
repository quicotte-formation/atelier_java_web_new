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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IB
 */
@WebServlet(name = "PrefServlet", urlPatterns = {"/preference"})
public class PrefServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Récup theme à appliquer
        String theme = req.getParameter("theme");
        
        if( "jamaique".equals(theme) ){
            resp.addCookie( new Cookie("couleurArrierePlan", "green") );
        } else{
            resp.addCookie( new Cookie("couleurArrierePlan", "blue") );
        }
        
        // Redirection
        resp.sendRedirect("lister_films");
    }

    
}
