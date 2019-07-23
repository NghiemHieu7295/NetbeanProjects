package hieu.springmvcjavaconfig.controller;

import hieu.springmvcjavaconfig.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KaratedoController {
    
    @Autowired
    @Qualifier("karatedoCoach")
    private Coach theCoach;
    
    @RequestMapping("/testKaratedo")
    public String getKaratedoCoach(Model model){
        model.addAttribute("theCoach", theCoach);
        return "karatedo-info";
    }
}
