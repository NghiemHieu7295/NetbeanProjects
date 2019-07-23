
package hieu.GoogleDrivePermissionManagerV2.controller;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeRequestUrl;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizeController {
    
    private static final String APP_NAME = "Google Drive Permission Manager";
    
    private static JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    
    private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE);
    
    private static final File TOKEN_FOLDER = new File("D:\\NetbeansProjects\\GoogleDrivePermissionManagerV2\\tokens");
    
    @Value("${google.oauth.callback.uri}")
    private String CALLBACK_URI;
    
    @Value("${google.secret.key.path}")
    private Resource secretKeys;
    
    private GoogleAuthorizationCodeFlow flow;
    
    @PostConstruct
    public void init() throws IOException, GeneralSecurityException{
        InputStream in = secretKeys.getInputStream();
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
        
        flow = new GoogleAuthorizationCodeFlow.Builder(new NetHttpTransport(), JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(TOKEN_FOLDER))
                .setAccessType("offline")
                .build();
        
        System.out.println("-------------------------");
        System.out.println("Create Flow Successfully!");
        System.out.println("-------------------------");
    }
    
    @GetMapping("/getAuthorization")
    public void checkAuthorization(HttpServletResponse response, HttpServletRequest request) throws IOException{
        PrintWriter out = response.getWriter();
        HttpSession sess = request.getSession();
        
        Credential credential = flow.loadCredential("user");
        
        if(credential != null){
            System.out.println("-----------------");
            System.out.println("Da co credential.");
            System.out.println("-----------------");
            
            
            
            Drive drive = (Drive) sess.getAttribute("drive");
            if(drive == null){
                drive = new Drive.Builder(new NetHttpTransport(), JSON_FACTORY, credential)
                    .setApplicationName(APP_NAME).build();
                sess.setAttribute("drive", drive);
                
                System.out.println("Da tao drive moi.");
            }
            else{
                System.out.println("Da co drive.");
            }
        }
        else{
            System.out.println("-----------------");
            System.out.println("Chua co credential. Dang tao credential...");
            System.out.println("-----------------");
            
            System.out.println("");
            GoogleAuthorizationCodeRequestUrl url = flow.newAuthorizationUrl();
            String redirectUrl = url.setRedirectUri(CALLBACK_URI).build();
            
            out.write(redirectUrl);
        }
    }
    
    @GetMapping("/oauth/Callback")
    public String getToken(HttpServletRequest request) throws IOException{
        System.out.println("-----------------");
        System.out.println("Dang lay token...");
        System.out.println("-----------------");
        
        String authorizeCode = request.getParameter("code");
        if(authorizeCode != null){
            TokenResponse tokenResponse = flow.newTokenRequest(authorizeCode)
                    .setRedirectUri(CALLBACK_URI).execute();
            flow.createAndStoreCredential(tokenResponse, "user");
        }
        
        System.out.println("-----------------");
        System.out.println("Da co token!");
        System.out.println("-----------------");
        return "redirect:/home";
    }
}
