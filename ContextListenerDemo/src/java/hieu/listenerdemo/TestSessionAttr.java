package hieu.listenerdemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestSessionAttr extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();
        
        out.println("Test Session Attributes:<br/>");
        HttpSession sess = request.getSession();
        sess.setAttribute("foo", 22);
        sess.setAttribute("bar", 42);
        sess.setMaxInactiveInterval(0);
        String foo = (String) sess.getAttribute("foo");
        if(sess.isNew()){
            out.println("This is a new session.");
        }
        else{
            out.println("Welcome back!");
        }
        out.println("Foo: " + foo);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
