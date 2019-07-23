package hieu.springmvcjavaconfig.model;

public class SadFortuneService implements FortuneService{
    
    @Override
    public String getFortune(){
        return "Hom nay la 1 ngay toi te :((";
    }
}