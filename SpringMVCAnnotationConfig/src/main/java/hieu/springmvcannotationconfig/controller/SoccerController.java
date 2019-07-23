package hieu.springmvcannotationconfig.controller;

import hieu.springmvcannotationconfig.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SoccerController {
    
    @Autowired
    @Qualifier("soccerCoach")
    private Coach theCoach;
    
    @RequestMapping("/testSoccer")
    public String getSoccerCoach(Model model){
        model.addAttribute("theCoach", theCoach);
        return "soccer-info";
    }
}