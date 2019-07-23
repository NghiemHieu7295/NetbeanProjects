package hieu.drivedemo1;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.google.api.services.drive.model.GeneratedIds;
import com.google.api.services.drive.model.Permission;
import com.google.api.services.drive.model.PermissionList;
import com.google.api.services.drive.model.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestDrive {
    
    private static final String APP_NAME = "Drive Demo 1";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final java.io.File CREDENTIAL_FOLDER = 
            new java.io.File("D:\\NetbeansProjects\\DriveDemo1\\src\\main\\resources\\credential");
    private static final String CLIENT_SECRET_FILE_NAME = "client_id.json";
    private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE);
    private static Drive drive;
    
    private static Credential getCredential(NetHttpTransport transport) throws FileNotFoundException, IOException{
        java.io.File clientSecretFilePath = new java.io.File(CREDENTIAL_FOLDER, CLIENT_SECRET_FILE_NAME);
        
        InputStream in = new FileInputStream(clientSecretFilePath);
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
        
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow
                .Builder(transport, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(CREDENTIAL_FOLDER))
                .setAccessType("offline")
                .build();
        
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8080).build();
        
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }
    
    public void createDrive(){
        if(drive != null){
            System.out.println("Da co drive roi. Su dung thoi.");
        }
        else{
            try{
                NetHttpTransport transport = GoogleNetHttpTransport.newTrustedTransport();
                Credential credential = getCredential(transport);
                drive = new Drive
                        .Builder(transport, JSON_FACTORY, credential)
                        .setApplicationName(APP_NAME)
                        .build();
                System.out.println("=====================");
                System.out.println("Tao drive thanh cong!");
                }
            catch(GeneralSecurityException | IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void copyFile(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Hay nhap file id: ");
            String fileId = scan.nextLine();
            System.out.print("Nhap ten file moi: ");
            String name = scan.nextLine();
            
            File content = new File();
            content.setName(name);
            
            try{
                drive.files().copy(fileId, content).execute();
                System.out.println("Copy file thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void createFile(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Hay nhap ten file: ");
            String name = scan.nextLine();
            System.out.print("Hay nhap file extension: ");
            String fileExtension = scan.nextLine();
            
            File content = new File();
            content.setName(name);
            content.setFileExtension(fileExtension);
            
            try{
                drive.files().create(content).execute();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void deleteFile(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Hay nhap file id: ");
            String fileId = scan.nextLine();
            
            try{
                drive.files().delete(fileId).execute();
                System.out.println("Xoa file thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void cleanRecycleBin(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            try{
                drive.files().emptyTrash().execute();
                System.out.println("Thung rac da duoc don dep.");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void exportContent(){
        //Need fileId, mimeType
    }
    
    public void createIDs(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            try{
                GeneratedIds generatedIds = drive.files().generateIds().setFields("ids").execute();
                List<String> result = generatedIds.getIds();
                for(String s : result){
                    System.out.println(s);
                }
                System.out.println("Lay ID thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void getFileInfo(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            try{
                Scanner scan = new Scanner(System.in);
                System.out.print("Hay nhap file id: ");
                String fileId = scan.nextLine();
                
                File file = drive.files().get(fileId).setFields("*").execute();
                
                System.out.println();
                System.out.println("FILE INFORMATION");
                System.out.println("-------------------------------");
                System.out.println("kind: " + file.getKind());
                System.out.println("id: " + file.getId());
                System.out.println("name: " + file.getName());
                System.out.println("mimeType: " + file.getMimeType());
                System.out.println("parents: [");
                    List<String> parents = file.getParents();
                    for(String p : parents){
                        System.out.println("\t" + p);
                    }
                System.out.println("]");
                System.out.println("version: " + file.getVersion());
                System.out.println("webContentLink: " + file.getWebContentLink());
                System.out.println("webViewLink: " + file.getWebViewLink());
                System.out.println("createdTime: " + file.getCreatedTime());
                System.out.println("owners: [");
                    List<User> owners = file.getOwners();
                    for(User o : owners){
                        System.out.println("\t{");
                        System.out.println("\t\tkind: " + o.getKind());
                        System.out.println("\t\tdisplayName: " + o.getDisplayName());
                        System.out.println("\t\temailAddress: " + o.getEmailAddress());
                        System.out.println("\t\tpermissionId: " + o.getPermissionId());
                        System.out.println("\t}");
                    }
                System.out.println("]");
                System.out.println("lastModifyingUser: {");
                    User u = file.getLastModifyingUser();
                    System.out.println("\tkind: " + u.getKind());
                    System.out.println("\tdisplayName: " + u.getDisplayName());
                    System.out.println("\temailAddress: " + u.getEmailAddress());
                    System.out.println("\tpermissionId: " + u.getPermissionId());
                System.out.println("}");
                System.out.println("shared: " + file.getShared());
                System.out.println("permissions: [");
                    List<Permission> permissions = file.getPermissions();
                    for(Permission p : permissions){
                        System.out.println("\t{");
                        System.out.println("\t\tkind: " + p.getKind());
                        System.out.println("\t\tid: " + p.getId());
                        System.out.println("\t\temailAddress: " + p.getEmailAddress());
                        System.out.println("\t\tdisplayName: " + p.getDisplayName());
                        System.out.println("\t\ttype: " + p.getType());
                        System.out.println("\t\trole: " + p.getRole());
                        System.out.println("\t}");
                    }
                System.out.println("]");
                System.out.println("permissionIds: [");
                    List<String> permissionIds = file.getPermissionIds();
                    for(String pi : permissionIds){
                        System.out.println(pi);
                    }
                System.out.println("]");
                System.out.println("originalFilename: " + file.getOriginalFilename());
                System.out.println("fullFileExtension: " + file.getFullFileExtension());
                System.out.println("md5Checksum: " + file.getMd5Checksum());
                System.out.println("-------------------------------");
                System.out.println("Lay thong tin thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void getListFile(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
           try{
                FileList fileList = drive.files().list().setPageSize(10).setFields("*").execute();
                System.out.println();
                System.out.println("LIST FILE");
                System.out.println("-------------------------------------");
                System.out.println("kind: " + fileList.getKind());
                System.out.println("nextPageToken: " + fileList.getNextPageToken());
                System.out.println("incompleteSearch: " + fileList.getIncompleteSearch());
                System.out.println("files: [");
                    List<File> files = fileList.getFiles();
                    for(File f : files){
                        System.out.println("\t{");
                        System.out.println("\t\tkind: " + f.getKind());
                        System.out.println("\t\tid: " + f.getId());
                        System.out.println("\t\tname: " + f.getName());
                        System.out.println("\t\tmimeType: " + f.getMimeType());
                        System.out.println("\t}");
                    }
                System.out.println("]");
                System.out.println("-------------------------------------");
                System.out.println("Lay thong tin thanh cong.");
           }
           catch(IOException e){
               System.out.println(e.getMessage());
           }
        }
    }
    
    public void upateFile(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            try{
                Scanner scan = new Scanner(System.in);
                System.out.print("Hay nhap file id: ");
                String fileId = scan.nextLine();
                
                File content = new File();
                content.setName("tai khoan 2");
                content.setDescription("Ban copy cua file tai khoan");
                
                drive.files().update(fileId, content).execute();
                System.out.println("Update thong tin thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void getListPermission(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            try{
                Scanner scan = new Scanner(System.in);
                System.out.print("Hay nhap file id: ");
                String fileId = scan.nextLine();
                
                PermissionList permissionList = drive.permissions().list(fileId).setPageSize(10).setFields("*").execute();
                System.out.println();
                System.out.println("LIST PERMISSION");
                System.out.println("---------------------------------------");
                System.out.println("kind: " + permissionList.getKind());
                System.out.println("nextPageToken: " + permissionList.getNextPageToken());
                System.out.println("permissions: [");
                    List<Permission> permissions = permissionList.getPermissions();
                    for(Permission p : permissions){
                        System.out.println("\t{");
                        System.out.println("\t\tkind: " + p.getKind());
                        System.out.println("\t\tdisplayName: " + p.getDisplayName());
                        System.out.println("\t\temailAddress: " + p.getEmailAddress());
                        System.out.println("\t\ttype: " + p.getType());
                        System.out.println("\t\trole: " + p.getRole());
                        System.out.println("\t\tid: " + p.getId());
                        System.out.println("\t}");
                    }
                System.out.println("]");
                System.out.println("---------------------------------------");
                System.out.println("Lay thong tin thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void getPermission(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Hay nhap file id: ");
            String fileId = scan.nextLine();
            System.out.print("Hay nhap permission id: ");
            String permissionId = scan.nextLine();
            
            try{
                Permission p = drive.permissions().get(fileId, permissionId).setFields("*").execute();
                System.out.println("PERMISSION INFO");
                System.out.println("--------------------------------------");
                System.out.println("{");
                System.out.println("\tkind: " + p.getKind());
                System.out.println("\tdisplayName: " + p.getDisplayName());
                System.out.println("\temailAddress: " + p.getEmailAddress());
                System.out.println("\ttype: " + p.getType());
                System.out.println("\trole: " + p.getRole());
                System.out.println("\tid: " + p.getId());
                System.out.println("\tphotoLink: " + p.getPhotoLink());
                System.out.println("\tdeleted: " + p.getDeleted());
                System.out.println("}");
                System.out.println("--------------------------------------");
                System.out.println("Lay thong tin thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void createPermission(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Hay nhap file id: ");
            String fileId = scan.nextLine();
            
            Permission content = new Permission();
            content.setEmailAddress("lznuscrfb6789@gmail.com");
            content.setType("user");
            content.setRole("reader");
            
            try{
                drive.permissions().create(fileId, content).execute();
                System.out.println("Tao permission thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void deletePermission(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Hay nhap file id: ");
            String fileId = scan.nextLine();
            System.out.print("Hay nhap permission id: ");
            String permissionId = scan.nextLine();
            
            try{
                drive.permissions().delete(fileId, permissionId).execute();
                System.out.println("Xoa permission thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void updatePermission(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Hay nhap file id: ");
            String fileId = scan.nextLine();
            System.out.print("Hay nhap permission id: ");
            String permissionId = scan.nextLine();
            System.out.print("Hay nhap role moi cho nguoi nay: ");
            String role = scan.nextLine();
            
            if(role.equalsIgnoreCase("owner")){
                Permission content = new Permission();
                content.setRole(role);
                
                try{
                    drive.permissions().update(fileId, permissionId, content).setTransferOwnership(true).execute();
                    System.out.println("Update permission thanh cong!");
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
            else{
                Permission content = new Permission();
                content.setRole(role);
                
                try{
                    drive.permissions().update(fileId, permissionId, content).execute();
                    System.out.println("Update permission thanh cong!");
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    public void createFolder(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Hay nhap ten folder: ");
            String name = scan.nextLine();
            
            File content = new File();
            content.setName(name);
            content.setMimeType("application/vnd.google-apps.folder");
            
            try{
                File file = drive.files().create(content).setFields("*").execute();
                System.out.println("Tao folder thanh cong!");
                System.out.println("Folder ID: " + file.getId());
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void uploadFile(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            File content = new File();
            content.setName("hay.txt");
            
            java.io.File filePath = new java.io.File("D:\\Hieu\\hay.txt");
            FileContent mediaContent = new FileContent("text/plain", filePath);
            
            try{
                drive.files().create(content, mediaContent).execute();
                System.out.println("Upload file thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void moveFile(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Hay nhap id cua file can di chuyen: ");
            String fileId = scan.nextLine();
            System.out.print("Hay nhap id cua folder se chuyen file toi: ");
            String folderId = scan.nextLine();
            
            try{
                File file = drive.files().get(fileId).setFields("parents").execute();
                StringBuilder prevParents = new StringBuilder();
                for(String parent : file.getParents()){
                    prevParents.append(parent);
                    prevParents.append(",");
                }
                
                drive.files().update(fileId, null)
                        .setRemoveParents(prevParents.toString())
                        .setAddParents(folderId)
                        .execute();
                
                System.out.println("Di chuyen file thanh cong!");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
            
        }
    }
    
    public void SearchForFile(){
        if(drive == null){
            System.out.println("Xin hay tao drive truoc.");
        }
        else{
            Scanner scan = new Scanner(System.in);
            
            try{
                FileList fileList = drive.files().list().setQ("'1rdbPtBuHMeYTfngULUWFBywID50iDgEA' in parents").execute();
                List<File> files = fileList.getFiles();
                for(File file : files){
                    System.out.println(file.getName());
                    System.out.println(file.getId());
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void main(String[] args){
        TestDrive obj = new TestDrive();
        Scanner scan = new Scanner(System.in);
        int choose = 0;
        boolean valid;
        String conti;
        
        while(true){
            System.out.println(">> Working with Google Drive <<");
            System.out.println("+-----------------------------+");
            System.out.println("| 1.  Create Drive.           |");
            System.out.println("| 2.  Copy File.              |");
            System.out.println("| 3.  Create File.            |");
            System.out.println("| 4.  Delete File.            |");
            System.out.println("| 5.  Empty Trash.            |");
            System.out.println("| 6.  Export Content.         |");
            System.out.println("| 7.  Create IDs.             |");
            System.out.println("| 8.  Get File Info.          |");
            System.out.println("| 9.  Get List File.          |");
            System.out.println("| 10. Update File Info.       |");
            System.out.println("| 11. Get List Permission.    |");
            System.out.println("| 12. Get Permission Info.    |");
            System.out.println("| 13. Create Permission.      |");
            System.out.println("| 14. Delete Permission.      |");
            System.out.println("| 15. Update Permission.      |");
            System.out.println("| 16. Create Folder.          |");
            System.out.println("| 17. Upload File.            |");
            System.out.println("| 18. Move File.              |");
            System.out.println("| 19. Search File.            |");
            System.out.println("| 20. Exit                    |");
            System.out.println("+-----------------------------+");
            do{
                try{
                    choose = scan.nextInt();
                    valid = true;
                }
                catch(Exception e){
                    scan.next();
                    System.out.println("Xin hay nhap so de chon chuc nang.");
                    valid = false;
                }
            }while(!valid);
            
            switch(choose){
                case 1:
                    obj.createDrive();
                    break;
                case 2:
                    obj.copyFile();
                    break;
                case 3:
                    obj.createFile();
                    break;
                case 4:
                    obj.deleteFile();
                    break;
                case 5:
                    obj.cleanRecycleBin();
                    break;
                case 6:
                    obj.exportContent();
                    break;
                case 7:
                    obj.createIDs();
                    break;
                case 8:
                    obj.getFileInfo();
                    break;
                case 9:
                    obj.getListFile();
                    break;
                case 10:
                    obj.upateFile();
                    break;
                case 11:
                    obj.getListPermission();
                    break;
                case 12:
                    obj.getPermission();
                    break;
                case 13:
                    obj.createPermission();
                    break;
                case 14:
                    obj.deletePermission();
                    break;
                case 15:
                    obj.updatePermission();
                    break;
                case 16:
                    obj.createFolder();
                    break;
                case 17:
                    obj.uploadFile();
                    break;
                case 18:
                    obj.moveFile();
                    break;
                case 19:
                    obj.SearchForFile();
                    break;
                default:
                    break;
            }
            
            scan.nextLine();
            System.out.print("Ban co dung chuong trinh nua khong? (Y/N) ");
            do{
               conti = scan.nextLine();
               if(conti.matches("[YyNn]")){
                   break;
               }
               else{
                   System.out.println("Xin hay nhap lai. Chi nhap y hoac n.");
               }
            }while(true);
            
            if(conti.equalsIgnoreCase("N")){
                break;
            }
        }
        
        System.out.println("Cam on ban da su dung chuong trinh.");
    }   
}