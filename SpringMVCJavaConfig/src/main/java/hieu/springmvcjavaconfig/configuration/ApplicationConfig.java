package hieu.springmvcjavaconfig.configuration;

import hieu.springmvcjavaconfig.model.BaseballCoach;
import hieu.springmvcjavaconfig.model.Coach;
import hieu.springmvcjavaconfig.model.CricketCoach;
import hieu.springmvcjavaconfig.model.FortuneService;
import hieu.springmvcjavaconfig.model.HappyFortuneService;
import hieu.springmvcjavaconfig.model.KaratedoCoach;
import hieu.springmvcjavaconfig.model.SadFortuneService;
import hieu.springmvcjavaconfig.model.SoccerCoach;
import hieu.springmvcjavaconfig.model.SwimCoach;
import hieu.springmvcjavaconfig.model.TennisCoach;
import hieu.springmvcjavaconfig.model.TrackCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "hieu.springmvcjavaconfig")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
    
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        
        System.out.println("OK!!!");
        return viewResolver;
    }
    
    //Define bean HappyFortuneService
    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }
    
    //Define bean SadFortuneService
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    
    //Bean BaseballCoach. This bean has injection by constructor
    @Bean
    public Coach baseballCoach(){
        BaseballCoach bbCoach = new BaseballCoach(sadFortuneService(), "Nghiem Manh Hieu", (byte) 24);
        return bbCoach;
    }
    
    //Bean TrackCoach. This bean has injection by setter methods
    @Bean
    public Coach trackCoach(){
        TrackCoach trCoach = new TrackCoach();
        trCoach.setFortuneService(happyFortuneService());
        trCoach.setName("Phung Thi Hai Yen");
        trCoach.setAge((byte) 21);
        return trCoach;
    }
    
    //Bean CricketCoach. This bean has directly field injection
    @Bean
    public Coach cricketCoach(){
        CricketCoach crCoach = new CricketCoach();
        return crCoach;
    }
    
    //Bean SoccerCoach. This bean has directly field injection from properties file
    @Bean
    public Coach soccerCoach(){
        SoccerCoach sCoach = new SoccerCoach();
        return sCoach;
    }
    
    //Bean TennisCoach. This bean has default scope: Singleton
    @Bean
    public Coach tennisCoach(){
        TennisCoach tnCoach = new TennisCoach();
        return tnCoach;
    }
    
    //Bean SwimCoach. This bean has scope: Prototype
    @Bean
    @Scope("prototype")
    public Coach swimCoach(){
        SwimCoach swCoach = new SwimCoach();
        return swCoach;
    }
    
    //Bean KaratedoCoach. This bean has custom init method and destroy method
    @Bean
    public Coach karatedoCoach(){
        KaratedoCoach karaCoach = new KaratedoCoach();
        return karaCoach;
    }
}