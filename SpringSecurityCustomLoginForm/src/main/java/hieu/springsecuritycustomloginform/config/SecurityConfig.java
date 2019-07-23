
package hieu.springsecuritycustomloginform.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.User.UserBuilder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    //add a reference to our security data source
    @Autowired
    private DataSource securityDataSource;
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
        //use memory authentication
        //UserBuilder users = User.builder();
        //PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        
        /*auth.inMemoryAuthentication()
                .withUser(users.username("john").password(encoder.encode("test123")).roles("EMPLOYEE"))
                .withUser(users.username("mary").password(encoder.encode("test123")).roles("EMPLOYEE", "MANAGER"))
                .withUser(users.username("susan").password(encoder.encode("test123")).roles("EMPLOYEE", "ADMIN"));*/
        
        //use jdbc authentication
        auth.jdbcAuthentication().dataSource(securityDataSource);
        
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasRole("EMPLOYEE")
                .antMatchers("/leaders/**").hasRole("MANAGER")
                .antMatchers("/systems/**").hasRole("ADMIN")
            .and()
            .formLogin()
                .loginPage("/showLoginPage")
                .loginProcessingUrl("/processLogin")
                .permitAll()
            .and()
                .logout()
                .permitAll()
            .and()
                .exceptionHandling().accessDeniedPage("/access-denined");
    }
    
}
