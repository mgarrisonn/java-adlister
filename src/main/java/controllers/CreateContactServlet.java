//package controllers;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet (name = "CreateContactServlet", urlPatterns = "/create")
//public class CreateContactServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String contactName = req.getParameter("name");
//        String contactPhoneNumber = req.getParameter("phone");
//
//        Contacts contactsDao = DaoFactory.getContactsDao();
//        long lastInsertId = ContactsDao.save(new Contact(contactName, contactPhoneNumber));
//
//
//        resp.sendRedirect("/contacts");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("").forward(req, resp);
//    }
//}
