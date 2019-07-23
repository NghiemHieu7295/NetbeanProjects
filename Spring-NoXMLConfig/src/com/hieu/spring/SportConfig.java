package com.hieu.spring;

//import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
    
    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }
    
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    
    @Bean
    public Coach baseballCoach(){
        BaseballCoach bbCoach = new BaseballCoach(happyFortuneService());
        return bbCoach;
    }
    
    @Bean
    public Coach trackCoach(){
        TrackCoach trCoach = new TrackCoach();
        trCoach.setFortuneService(sadFortuneService());
        return trCoach;
    }
    
    @Bean
    public Coach cricketCoach(){
        CricketCoach ccCoach = new CricketCoach();
        return ccCoach;
    }
}
