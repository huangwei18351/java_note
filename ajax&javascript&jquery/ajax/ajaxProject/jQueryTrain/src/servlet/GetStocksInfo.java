package servlet;

import bean.Stock;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class GetStocksInfo extends HttpServlet{
    private HashMap<String, Stock> stocks;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //返回两只股票的价格信息
        double sz = Math.random() * 20;
        double pf = Math.random() * 0.5;

        //通过随机数是奇数还是偶数来判断股票上涨还是下跌
        boolean flagsz = (int)(Math.random() * 10) % 2 == 0;
        boolean flagpf = (int)(Math.random() * 10) % 2== 0;

        //2.将随机数和股票的当前价进行加或减的操作，得到新的当前价格
        Stock szzs = stocks.get("30001");
        Stock pfyh = stocks.get("00001");
        double temp;
        if(flagsz){
            temp = szzs.getNow() + sz;

        }else{
            temp = szzs.getNow() - sz;
        }
        //需要对新的当前价格进行截取，只保留小数点后两位
        temp = (int) (temp * 100) / 100.0;
        szzs.setNow(temp);

        if(flagpf){
            temp = pfyh.getNow() + pf;

        }else{
            temp = pfyh.getNow() - pf;
        }

        temp = (int) (temp * 100) / 100.0;
        pfyh.setNow(temp);

        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
//        out.println(szzs + "<br />" + pfyh);
        //3.返回两只股票的昨天收盘，今天开盘和当前价格

        StringBuilder builder = new StringBuilder();
        //(JSON)
        /*builder.append("[{name:\"").append(szzs.getName()).append("\",id:\"").append(szzs.getId())
                .append("\",yes:").append(szzs.getYesterday()).append(",tod:").append(szzs.getToday())
                .append(",now:").append(szzs.getNow())
                .append("},")
                .append("{name:\"").append(pfyh.getName()).append("\",id:\"").append(pfyh.getId())
                .append("\",yes:").append(pfyh.getYesterday()).append(",tod:").append(pfyh.getToday())
                .append(",now:").append(pfyh.getNow())
                .append("}]");*/

        //采用对象的方式回传两个股票对象
        builder.append("({")
                .append("\"").append(szzs.getId()).append("\":{name:\"").append(szzs.getName())
                .append("\",yes:").append(szzs.getYesterday()).append(",tod:").append(szzs.getToday())
                .append(",now:").append(szzs.getNow())
                .append("},")
                .append("\"").append(pfyh.getId()).append("\":{name:\"").append(pfyh.getName())
                .append("\",yes:").append(pfyh.getYesterday()).append(",tod:").append(pfyh.getToday())
                .append(",now:").append(pfyh.getNow())
                .append("}})");
        System.out.println(builder);
        out.print(builder);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        stocks = new HashMap<String, Stock>();
        //创建股票
        Stock szzs = new Stock(2900,2900,"上证指数","30001");
        Stock pufa = new Stock(2900,2900,"浦发英航","00001");

        //将两只股票保存在stocks的map中
        stocks.put(szzs.getId(),szzs);
        stocks.put(pufa.getId(),pufa);
        System.out.println(stocks);
    }
}