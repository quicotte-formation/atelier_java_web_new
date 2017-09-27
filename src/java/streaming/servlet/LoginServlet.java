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

/**
 *
 * @author IB
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/verif_login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        String login = req.getParameter("pseudo");
        String mdp = req.getParameter("mdp");
        
        if( "admin".equals(login) && "admin".equals(mdp)  ){// LOGIN OK
            
            req.getSession().setAttribute("utilConnecte", login);
            req.getRequestDispatcher("login_ok.jsp").forward(req, resp);
        }else{
            
            req.setAttribute("messageErreur", "Erreur de connexion!");
            req.getRequestDispatcher("erreur.jsp").forward(req, resp);
        }
    }

    
}
