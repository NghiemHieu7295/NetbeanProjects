package hieu.springmvcxmlconfig.controller;

import hieu.springmvcxmlconfig.model.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CricketController {
    
    @Autowired
    private CricketCoach coach1;
    
    @Autowired
    private CricketCoach coach2;
    
    @RequestMapping("/testCricket")
    public String getCricketCoach(Model model){
        model.addAttribute("coach1", coach1);
        model.addAttribute("coach2", coach2);
        return "cricket-info";
    }
}