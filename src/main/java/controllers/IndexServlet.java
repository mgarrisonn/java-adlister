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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // let's get all of the burgers that exist currently wih links to their
        // individual
        McBurgers burgerDao = DoaFactory.getMcBurgersDao();

        // find the burgers, 1 by 1
        List<McBurger> allBurgers = new ArrayList<>();
        allBurgers.add(burgerDao.findById(1));
        allBurgers.add(burgerDao.findById(2));
        allBurgers.add(burgerDao.findById(3));


        req.setAttribute("allBurgers", allBurgers);
        req.getRequestDispatcher("webapp/index.jsp").forward(req, resp);
    }
}
