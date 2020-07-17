package controllers;

import models.DoaFactory;
import models.McBurger;
import models.McBurgers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShoeBurgerServlet", urlPatterns = "/burgers/show")
public class ShowBurgerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // check for the burger id attribute and the URL
        long burgerId = Long.parseLong(req.getParameter("id"));

        // create a connection to the DAO factory
        McBurgers burgerDao = DoaFactory.getMcBurgersDao();
        // Get the burger by it's ID, using findById
        McBurger thisBurger = burgerDao.findById(burgerId);
        // Send that burger to the JSP
        req.setAttribute("burger", thisBurger);

        req.setAttribute("burger", thisBurger);
        req.getRequestDispatcher("").forward(req, resp);
    }
}
