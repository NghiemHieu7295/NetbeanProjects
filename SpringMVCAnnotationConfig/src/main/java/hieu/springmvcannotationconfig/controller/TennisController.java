package hieu.springmvcannotationconfig.controller;

import hieu.springmvcannotationconfig.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TennisController {
    
    @Autowired
    @Qualifier("tennisCoach")
    private Coach tnCoach1;
    
    @Autowired
    @Qualifier("tennisCoach")
    private Coach tnCoach2;
    
    @RequestMapping("/testTennis")
    public String getTennisCoach(Model model){
        model.addAttribute("tnCoach1", tnCoach1);
        model.addAttribute("tnCoach2", tnCoach2);
        return "tennis-info";
    }
}
