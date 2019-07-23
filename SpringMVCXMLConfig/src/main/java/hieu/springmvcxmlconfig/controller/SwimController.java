package hieu.springmvcxmlconfig.controller;

import hieu.springmvcxmlconfig.model.SwimCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwimController {
    
    @Autowired
    private SwimCoach theCoach;
    
    @RequestMapping("/testSwim")
    public String getSwimCoach(Model model){
        model.addAttribute("theCoach", theCoach);
        return "swim-info";
    }
}