
package hieu.springsecuritycustomloginform.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "hieu.springsecuritycustomloginform")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
    
    //set up variable to hold the properties
    @Autowired
    private Environment env;
    
    //set up a logger for diagnostics
    private final Logger LOGGER = Logger.getLogger(getClass().getName());
    
    //define bean for viewResolver
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        
        return viewResolver;
    }
    
    //define a bean for our security datasource
    @Bean
    public DataSource securityDataSource(){
        
        //create connection pool
        ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
        
        //set the jdbc driver class
        try{
            securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
        }
        catch(PropertyVetoException e){
            System.out.println(e.getMessage());
        }
        
        //log the connection properties
        //for sanity's sake, log this info
        //just to make sure we are really reading data from properties file
        LOGGER.log(Level.INFO, ">>> jdbc.url = {0}", env.getProperty("jdbc.url"));
        LOGGER.log(Level.INFO, ">>> jdbc.user = {0}", env.getProperty("jdbc.user"));
        
        //set database connection properties
        securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
        securityDataSource.setUser(env.getProperty("jdbc.user"));
        securityDataSource.setPassword(env.getProperty("jdbc.password"));
        
        //set connection pool properties
        securityDataSource.setInitialPoolSize(Integer.parseInt(env.getProperty("connection.pool.initialPoolSize")));
        securityDataSource.setMinPoolSize(Integer.parseInt(env.getProperty("connection.pool.minPoolSize")));
        securityDataSource.setMaxPoolSize(Integer.parseInt(env.getProperty("connection.pool.maxPoolSize")));
        securityDataSource.setMaxIdleTime(Integer.parseInt(env.getProperty("connection.pool.maxIdleTime")));
        
        return securityDataSource;
    }
}
