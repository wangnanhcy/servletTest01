package cn.andios.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Countservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.取值(不可能出现空值)
        int count = (int)getServletContext().getAttribute("count");
        resp.setContentType("text/html;charset=UTF-8");
        //2.输出到界面
        resp.getWriter().write("当前网站成功登录总次数为:"+count+"次");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
