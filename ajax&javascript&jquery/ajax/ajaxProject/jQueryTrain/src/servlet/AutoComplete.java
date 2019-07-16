package servlet;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sshss on 2017/6/23.
 * 接收用户端请求
 */
public class AutoComplete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //表示页面传过来的字符串，用于和服务端的单词进型完整匹配
        String word = request.getParameter("word");
        //将字符串保存在request对象中
        request.setAttribute("word", word);
        /*将请求转发给视图层，（注意ajax中，这个所谓的视图层不返回页面，只返回数据，所以
        *也可以称作是一个数据层
        * */
        String path = this.getServletConfig().getServletContext().getRealPath("/");
        Element rootElement = getRootElement(path);
        List<String> wordList = new ArrayList<String>();
        NodeList childNodes = rootElement.getChildNodes();
        for(int i = 0; i < childNodes.getLength(); i++){
            if(childNodes.item(i).getNodeName().equals("word")){
                NodeList nodeList = childNodes.item(i).getChildNodes();
                Node node = nodeList.item(0);
                if(node.getNodeValue().startsWith(word)){
                    wordList.add(node.getNodeValue());
                }

            }
        }
        request.setAttribute("wordList", wordList);
        request.getRequestDispatcher("wordxml.jsp").forward(request,response);
    }
    private Element getRootElement(String path){
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder builder = null;
        try {
            builder = builderFactory.newDocumentBuilder();
            /*
         * builder.parse()方法将给定文件的内容解析为一个 XML 文档， 并且返回一个新的 DOM Document对象。
         */

            Document document = builder.parse(new File(path + "word.xml"));
            //获取文档的根元素，赋值给rootElement变量
            Element rootElement = document.getDocumentElement();
            return rootElement;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
