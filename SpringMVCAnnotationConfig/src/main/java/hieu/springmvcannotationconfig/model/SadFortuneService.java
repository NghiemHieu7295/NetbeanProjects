package hieu.springmvcannotationconfig.model;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService{
    
    @Override
    public String getFortune(){
        return "That la 1 ngay xui xeo :(";
    }
}