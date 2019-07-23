package hieu.springmvcxmlconfig.controller;

import hieu.springmvcxmlconfig.model.TennisCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TennisController {
    
    @Autowired
    private TennisCoach coach1;
    
    @Autowired
    private TennisCoach coach2;
    
    @RequestMapping("/testTennis")
    public String getTennisCoach(Model model){
        model.addAttribute("coach1", coach1);
        model.addAttribute("coach2", coach2);
        return "tennis-info";
    }
}