import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "Count", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

//    private int counter = 0;

    private static int counters = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        counter += 1;
//        response.getWriter().println("<h1>The number of views is " + counter + ".<h1>");
        response.setContentType("text/html");
        String reset = request.getParameter("reset");

        PrintWriter out = response.getWriter();

        if(reset != null){
            counters = 0;
        }
        counters += 1;

        out.println("<h1>The count is " + counters + "<h1>");
    }

}

//1. ping /count
//2. when someone pings that url add 1 to the counter
//3. if i need to keept track of a count - need a global counter variable
//4. check to see if a parameter to reset exists
//5. if a reset variable exists, reset the counter to 0
//6. return final count
