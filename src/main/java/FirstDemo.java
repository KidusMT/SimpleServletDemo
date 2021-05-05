import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author KidusMT
 * Date: 5/5/2021
 */
//@WebServlet("/welcome")///FirstServletDemo/welcome
public class FirstDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello Dawg.</h1>");
    }
}
