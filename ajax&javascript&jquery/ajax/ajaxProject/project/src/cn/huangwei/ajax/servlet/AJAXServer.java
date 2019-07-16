package cn.huangwei.ajax.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;


public class AJAXServer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
//            request.setCharacterEncoding("UTF-8");
//            response.setContentType("text/html;charset=gb18030");

            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();

            Integer inte = (Integer) request.getSession().getAttribute("total");
            int temp = 0;
            if (inte == null) {
                temp = 1;
            } else {
                temp = inte.intValue() + 1;
            }
            request.getSession().setAttribute("total",temp);

            //1.取参数
            String old = request.getParameter("name");
            //String name = new String(old.getBytes("iso8859-1"),"UTF-8");
            String name = URLDecoder.decode(old,"UTF-8");
            //2.检查参数是否有问题
            if(old == null || old.length() == 0){
                out.println("用户名不能为空");
            } else{
//                String name = URLDecoder.decode(old,"UTF-8");
//                byte[] by = old.getBytes("ISO8859-1");
//                String name = new String(by,"utf-8");
//                String name = URLDecoder.decode(old,"utf-8");
                //3.校验操作
//                String name = old;
                if(name.equals("wangxingkui")){
                    //4。和传统应用不同之处。这一步需要将用户感兴趣的数据返回给页面段，而不是将一个新的页面发送给用户
                    //写法没有变化，本质发生了改变
                    out.println("用户名[" + name + "]已经存在，请使用其他用户名, " + temp);
                } else{
                    out.println("用户名[" + name + "]尚未存在，可以使用该用户名注册, " + temp);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
