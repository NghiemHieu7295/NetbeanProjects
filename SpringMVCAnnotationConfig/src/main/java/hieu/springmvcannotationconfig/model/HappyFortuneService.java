package hieu.springmvcannotationconfig.model;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    
    @Override
    public String getFortune(){
        return "Hom nay la 1 ngay may man ^.^";
    }
}