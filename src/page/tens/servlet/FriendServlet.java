package page.tens.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FriendServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        resp.setStatus(501);
    }
}
