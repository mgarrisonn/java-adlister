import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "SettingsServlet", urlPatterns = "/settings")
public class SettingsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/settings.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();


        if (req.getParameter("reset") != null){
            session.removeAttribute("font-color");
            session.removeAttribute("background-color");

            resp.sendRedirect("/profile");
        } else if (req.getParameter("theme").equals("dark")){
            session.setAttribute("font-color", "#fff");
            session.setAttribute("background-color", "#000");

            resp.sendRedirect("/profile");
        } else {
            session.setAttribute("font-color", "#000");
            session.setAttribute("background-color", "#fff");

            resp.sendRedirect("/profile");
        }
    }
}
