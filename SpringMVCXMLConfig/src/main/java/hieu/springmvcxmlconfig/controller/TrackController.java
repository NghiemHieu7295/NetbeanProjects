package hieu.springmvcxmlconfig.controller;

import hieu.springmvcxmlconfig.model.TrackCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrackController {
    
    @Autowired
    private TrackCoach theCoach;
    
    @RequestMapping("/testTrack")
    public String getTrackCoach(Model model){
        model.addAttribute("theCoach", theCoach);
        return "track-info";
    }
}