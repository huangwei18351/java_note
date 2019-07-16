package cn.huangwei.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GetAjaxInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetAjaxInfoServlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");
		
		if("jsonObject".equals(action)){
			this.getJsonObject(request, response);
		}else if("jsonArray".equals(action)){
			this.getJsonArray(request, response);
		}else if("jsonNested".equals(action)){
			this.getJsonNested(request, response);
		}else if("checkUserName".equals(action)){
			this.checkUserName(request, response);
		}else if("twoLevelLink".equals(action)){
			this.twoLevelLink(request, response);
		}
	}
	
	
	private void twoLevelLink(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String provinceId = request.getParameter("provinceId");
		JSONObject resultJson = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		JSONObject temp = null;
		switch(Integer.parseInt(provinceId)){
			case 1:{
				temp = new JSONObject();
				temp.put("id", 1);
				temp.put("city", "南京市");
				jsonArray.add(temp);
				break;
			}
			case 2:{
				temp = new JSONObject();
				temp.put("id", 2);
				temp.put("city", "济南市");
				jsonArray.add(temp);
				break;
			}
			case 3:{
				temp = new JSONObject();
				temp.put("id", 3);
				temp.put("city", "温州市");
				jsonArray.add(temp);
				break;
			}
		}
		resultJson.put("menu", jsonArray);
		out.println(resultJson);
		out.flush();
		out.close();
	}

	private void checkUserName(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		JSONObject resultJson = new JSONObject();
		if("jack".equals(username)){
			resultJson.put("exist", true);
		}else{
			resultJson.put("exist", false);
		}
		out.println(resultJson);
		out.flush();
		out.close();
	}

	//json嵌套
	private void getJsonNested(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JSONArray jsonArray = new JSONArray();
		JSONObject resultJson1 = new JSONObject();
		resultJson1.put("name", "张三");
		resultJson1.put("password", "123");
		
		JSONObject score1 = new JSONObject();
		score1.put("chinese", 99);
		score1.put("math", 88);
		resultJson1.put("score", score1);
		
		JSONObject resultJson2 = new JSONObject();
		resultJson2.put("name", "李四");
		resultJson2.put("password", "1232");
		
		JSONObject score2 = new JSONObject();
		score2.put("chinese", 99);
		score2.put("math", 88);
		resultJson2.put("score", score2);
		
		JSONObject resultJson3 = new JSONObject();
		resultJson3.put("name", "王五");
		resultJson3.put("password", "1232");
		
		JSONObject score3 = new JSONObject();
		score3.put("chinese", 99);
		score3.put("math", 88);
		resultJson3.put("score", score3);
		
		jsonArray.add(resultJson1);
		jsonArray.add(resultJson2);
		jsonArray.add(resultJson3);
		JSONObject resultJson = new JSONObject();
		resultJson.put("students", jsonArray);
		out.println(resultJson);
		out.flush();
		out.close();
	}
	//JSON数组
	private void getJsonArray(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JSONArray jsonArray = new JSONArray();
		JSONObject resultJson1 = new JSONObject();
		resultJson1.put("name", "张三");
		resultJson1.put("password", "123");
		JSONObject resultJson2 = new JSONObject();
		resultJson2.put("name", "李四");
		resultJson2.put("password", "1232");
		JSONObject resultJson3 = new JSONObject();
		resultJson3.put("name", "王五");
		resultJson3.put("password", "1232");
		jsonArray.add(resultJson1);
		jsonArray.add(resultJson2);
		jsonArray.add(resultJson3);
		JSONObject resultJson = new JSONObject();
		resultJson.put("students", jsonArray);
		out.println(resultJson);
		out.flush();
		out.close();
	}
	//json对象
	private void getJsonObject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JSONObject resultJson = new JSONObject();
		resultJson.put("name", "张三");
		resultJson.put("password", "123");
		out.println(resultJson);
		out.flush();
		out.close();
	}

}
