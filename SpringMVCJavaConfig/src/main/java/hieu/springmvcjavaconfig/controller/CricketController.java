package hieu.springmvcjavaconfig.controller;

import hieu.springmvcjavaconfig.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CricketController {
    
    @Autowired
    @Qualifier("cricketCoach")
    private Coach theCoach;
    
    @RequestMapping("/testCricket")
    public String getCricketCoach(Model model){
        model.addAttribute("theCoach", theCoach);
        return "cricket-info";
    }
}