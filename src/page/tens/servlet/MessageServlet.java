package page.tens.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MessageServlet extends second10Servlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        resp.setStatus(501);
    }
}
