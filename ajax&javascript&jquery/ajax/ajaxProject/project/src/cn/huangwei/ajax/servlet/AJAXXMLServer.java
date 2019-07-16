package cn.huangwei.ajax.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//XML的数据
public class AJAXXMLServer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            //修改点1---text/html改成text/xml
            response.setContentType("text/xml;charset=utf-8");
            PrintWriter out = response.getWriter();


            //1.取参数
            String receiver = request.getParameter("name");
            //中文乱码问题
            String old = new String(receiver.getBytes("ISO8859-1"),"UTF-8");
            //该方式需要前台的url进行两次encode
            //String old = URLDecoder.decode(receiver, "UTF-8");
            //修改点2--返回的数据需要拼接成xml格式
            StringBuilder builder = new StringBuilder();
            builder.append("<message>");

            //2.检查参数是否有问题
            if(old == null || old.length() == 0){
                builder.append("用户名不能为空").append("</message>");
            } else{
                //3.校验操作
                String name = old;

                if(name.equals("wangxingkui")){
                    //4。和传统应用不同之处。这一步需要将用户感兴趣的数据返回给页面段，而不是将一个新的页面发送给用户
                    //写法没有变化，本质发生了改变
                    //修改点3----关闭标签
                    builder.append("用户名[" + name + "]已经存在，请使用其他用户名").append("</message>");
                } else{
                    builder.append("用户名[" + name + "]尚未存在，可以使用该用户名注册").append("</message>");
                }
            }
            out.println(builder.toString());
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
