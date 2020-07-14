import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Count", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter += 1;
        response.getWriter().println("<h1>The number of views is " + counter + ".<h1>");
    }

}
