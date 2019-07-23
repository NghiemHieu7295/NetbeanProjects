package hieu.listenerdemo;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Dog implements HttpSessionBindingListener{
    
    private String breed;
    
    public Dog(String breed){
        this.breed = breed;
    }
    
    public String getBreed(){
        return breed;
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        //code to run now that I know I'm in a session
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        //code to run now that I know I'm no longer part of a session
    }
    
    
}
