package cn.huangwei.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAjaxNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetAjaxNameServlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name + "-------" + password);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("ajax返回的文本");
		out.flush();
		out.close();
	}

}
