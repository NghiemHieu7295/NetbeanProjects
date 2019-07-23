
package hieu.GoogleDrivePermissionManagerV2.controller;

import hieu.GoogleDrivePermissionManagerV2.model.User;
import hieu.GoogleDrivePermissionManagerV2.repository.UserRepository;
import hieu.GoogleDrivePermissionManagerV2.service.UserServiceImpl;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @GetMapping("register")
    public String showRegisterPage(){
        return "register";
    }
    
    @PostMapping("/processRegister")
    public String processRegister(HttpServletRequest request, Model model){
        
        String error = "";
        
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        String mail = request.getParameter("email");
        
        String namePattern = "\\w{8,32}";
        String passPattern = "^(?=.*[0-9]+)(?=.*[a-zA-Z]+)(?=.*[@#$%^&+=]+)(?=\\S+$).{6,32}$";
        String mailPattern = "\\w+@\\w+(\\.\\w+){1,2}";
        
        if(name.matches(namePattern) == false){
            error += "User name phải gồm chữ cái hoặc số, tối thiểu 8, tối đa 32 ký tự.";
        }
        
        if(pass.matches(passPattern) == false){
            error += "<br/>Password phải chứa ít nhất 1 số, 1 chữ cái, 1 ký tự đặc biệt (@, #, $, %, ^, &, +, =), "
                    + "không chứa khoảng trắng, tối thiểu 6, tối đa 32 ký tự.";
        }
        
        if(mail.matches(mailPattern) == false){
            error += "<br/>Email phải chứa 1 ký tự @ và 1 ký tự \".\"";
        }
        
        if(error.length() > 0){
            model.addAttribute("error", error);
            
            return "register";
        }
        else{
            List<User> list = userRepository.findAll();
            for(User u : list){
                if(u.getName().equals(name)){
                    error += "User name này đã có người sử dụng. Xin chọn username khác.";
                    model.addAttribute("error", error);
                    return "register";
                }
                else if(u.getEmail().equals(mail)){
                    error += "Email này đã được sử dụng. Xin chọn email khác.";
                    model.addAttribute("error", error);
                    return "register";
                }
            }
            
            User u = new User();
            u.setName(name);
            u.setPassword(pass);
            u.setEmail(mail);
            
            userServiceImpl.saveUser(u);

            return "redirect:/login";
        }
    }
}
