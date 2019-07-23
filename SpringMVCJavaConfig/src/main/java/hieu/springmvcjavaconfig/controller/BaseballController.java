package hieu.springmvcjavaconfig.controller;

import hieu.springmvcjavaconfig.model.BaseballCoach;
import hieu.springmvcjavaconfig.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseballController {
    
    @Autowired
    @Qualifier("baseballCoach")
    private Coach theCoach;
    
    @RequestMapping("/testBaseball")
    public String getBaseballCoach(Model model){
        model.addAttribute("theCoach", theCoach);
        return "baseball-info";
    }
}