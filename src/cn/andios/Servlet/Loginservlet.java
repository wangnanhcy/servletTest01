package cn.andios.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Loginservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据(req包含请求的信息)
        String userName = req.getParameter("username");
        String passWord = req.getParameter("password");
        System.out.println(userName+"=="+passWord);
        //校验数据(resp相应数据给浏览器)
        PrintWriter p = resp.getWriter();
        if("wangnan".equals(userName)&&"123".equals(passWord)){
         //1、成功次数的累加
            //获取旧值
            Object obj = getServletContext().getAttribute("count");
            int totalCount = 0;
            if(obj!=null){
                totalCount= (int) obj;
            }
            System.out.println("登陆成功的次数是:"+totalCount);
            //登陆成功则给count加一
            getServletContext().setAttribute("count",totalCount+1);

         //2、跳转到login_success.jsp
            //设置状态码
            resp.setStatus(302);
            //定位跳转到的是哪一个页面
            resp.setHeader("Location","login_success.jsp");
        }else{
            //System.out.println("登陆失败");
            p.write("fail");
       }

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
