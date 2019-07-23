package hieu.listenerdemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestListener extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<p>Test context attributes set by listener:</p>");
        
        Dog dog = (Dog) this.getServletContext().getAttribute("dog");
        
        out.println("<p>Dog's breed is: " + dog.getBreed() + "</p>");
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
