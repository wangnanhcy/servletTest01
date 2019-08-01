package cn.andios.Servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
public class Downloadservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        //获取下载的文件名
        String fileName = req.getParameter("filename");
        //获取这个文件在tomcat里面的绝对路径地址
        String path = getServletContext().getRealPath("download/" + fileName);
        //让浏览器收到这份资源的时候，以下载的方式提醒客户，而不是直接展示
        resp.setHeader("Content-Disposition","attachment;filename="+fileName);
        //转化成输入流
        FileInputStream is = new FileInputStream(path);
        ServletOutputStream os = resp.getOutputStream();

        int len = 0;
        byte[] buffer = new byte[1024];
        while((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
