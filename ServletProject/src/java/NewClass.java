import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class NewClass extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("Welcome");
    }
    
}
