package page.tens.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/*
* HttpServlet 상속, 공통 로직 및 커스터마이즈
* */
public class second10Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //서블릿 구현에는 없는 PATCH 메소드를 사용한다.
        if (req.getMethod().equalsIgnoreCase("PATCH")) {
            doPatch(req, resp);
        }
        super.service(req, resp);
    }

    protected void doPatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
