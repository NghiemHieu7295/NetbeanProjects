package hieu.springmvcjavaconfig.controller;

import hieu.springmvcjavaconfig.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrackController {
    
    @Autowired
    @Qualifier("trackCoach")
    private Coach theCoach;
    
    @RequestMapping("/testTrack")
    public String getTrackCoach(Model model){
        model.addAttribute("theCoach", theCoach);
        return "track-info";
    }
}