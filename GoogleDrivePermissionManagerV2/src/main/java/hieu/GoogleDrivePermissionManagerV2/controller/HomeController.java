
package hieu.GoogleDrivePermissionManagerV2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.Permission;
import hieu.GoogleDrivePermissionManagerV2.DTO.PermissionDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    
    @GetMapping(value = {"/home", "/"})
    public String showHomePage(){
        return "home";
    }
    
    @PostMapping("/processUrl")
    public void processUrl(@RequestParam(name = "url", required = false) String driveUrl, 
            HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        
        if((driveUrl == null) || (driveUrl.matches("https://drive\\.google\\.com/.*") == false)){
            out.write("Link không hợp lệ.");
        }
        else{
            String rootID = driveUrl.substring(driveUrl.lastIndexOf("/") + 1);
            out.write(rootID);
        }
    }
    
    @PostMapping("/getInfo")
    public void getInfo(@RequestParam(name = "id", required = false) String fileId, 
            HttpServletResponse response, HttpServletRequest request) throws IOException{
        PrintWriter out = response.getWriter();
        
        HttpSession sess = request.getSession();
        Drive drive = (Drive) sess.getAttribute("drive");
        
        List<Permission> pers = drive.files().get(fileId).setFields("permissions").execute().getPermissions();
        List<PermissionDTO> perList = new ArrayList<>();
        
        for(Permission per : pers){
            PermissionDTO perDTO = new PermissionDTO();
            
            perDTO.setId(per.getId());
            perDTO.setName(per.getDisplayName());
            perDTO.setEmail(per.getEmailAddress());
            perDTO.setRole(per.getRole());
            
            perList.add(perDTO);
        }
        
        ObjectMapper mapper = new ObjectMapper();
        String jsonPerList = mapper.writeValueAsString(perList);
        
        out.write(jsonPerList);
    }
}
