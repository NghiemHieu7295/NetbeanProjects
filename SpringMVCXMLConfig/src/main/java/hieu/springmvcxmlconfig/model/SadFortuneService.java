package hieu.springmvcxmlconfig.model;

public class SadFortuneService implements FortuneService{
    
    @Override
    public String getFortune(){
        return "Uhh... bad day!!!";
    }
}