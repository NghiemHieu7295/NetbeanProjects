package hieu.springmvcannotationconfig.controller;

import hieu.springmvcannotationconfig.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwimController {
    
    @Autowired
    @Qualifier("swimCoach")
    private Coach swCoach1;
    
    @Autowired
    @Qualifier("swimCoach")
    private Coach swCoach2;
    
    @RequestMapping("/testSwim")
    public String getSwimCoach(Model model){
        model.addAttribute("swCoach1", swCoach1);
        model.addAttribute("swCoach2", swCoach2);
        return "swim-info";
    }
}