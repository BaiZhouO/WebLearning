package personal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MyServlet extends HttpServlet{

    public MyServlet()
    {
        super();
    }

    public void destroy()
    {
        super.destroy();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        response.setContentType("text/html");
        response.setCharacterEncoding("GB2312");

        PrintWriter out = response.getWriter(); //用PrintWriter对象输出字符串形式的正文
        out.println("<html>");
        out.println("<head><title>servlet实现jsp</title></head>");
        out.println("<body>");
        out.println("<div align=\"center\">");
        out.println("<font size=5 color=blue>");
        out.println("<b>");

        Date myDate = new Date();
        out.println("现在时间是： "+myDate);
        out.println("</font>");
        out.println("</b>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }

    public void init() throws ServletException{

    }
}
