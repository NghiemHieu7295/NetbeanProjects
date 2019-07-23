package hieu.springmvcxmlconfig.controller;

import hieu.springmvcxmlconfig.model.BaseballCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseballController {
    
    @Autowired
    private BaseballCoach theCoach;
    
    @RequestMapping("/testBaseball")
    public String getBaseballCoach(Model model){
        model.addAttribute("theCoach", theCoach);
        return "baseball-info";
    }
}