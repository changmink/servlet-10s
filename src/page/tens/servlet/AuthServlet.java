package page.tens.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AuthServlet extends second10Servlet {

    //로그인
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        // 이렇게 하면 담당자가 없어도 API구현 여부를 명확하게 할 수 있다. -> 다른 코드는 명확하지 않음
        resp.setStatus(501); //Not Implement
    }

    //가입
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
