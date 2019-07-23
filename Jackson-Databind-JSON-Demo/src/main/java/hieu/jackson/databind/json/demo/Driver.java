
package hieu.jackson.databind.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            
            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
            
            System.out.println("Firstname: " + theStudent.getFirstName());
            System.out.println("Lastname: " + theStudent.getLastName());
            Address tempAddress = theStudent.getAddress();
            String[] tempLanguages = theStudent.getLanguages();
            
            System.out.println("Street: " + tempAddress.getStreet());
            System.out.println("City: " + tempAddress.getCity());
            System.out.println("Country: " + tempAddress.getCountry());
            
            for(String lang : tempLanguages){
                System.out.println(lang);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
