
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;
import org.json.JSONObject;

@WebServlet(urlPatterns = "/test")
public class TestController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        
        Student student = new Student();
        student.setName("Nghiem Manh Hieu");
        student.setEmail("nmh7295@gmail.com");
        
        String json = JSONObject.valueToString(student);
        
        PrintWriter out = resp.getWriter();
        out.write(json);
    }
    
    
}
