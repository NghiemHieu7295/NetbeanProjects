
package hieu.springsecuritystarterdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //add our users for in memory authentication
        UserBuilder users = User.builder();
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        
        auth.inMemoryAuthentication()
                .withUser(users.username("john").password(encoder.encode("test123")).roles("EMPLOYEE"))
                .withUser(users.username("mary").password(encoder.encode("test123")).roles("MANAGER"))
                .withUser(users.username("susan").password(encoder.encode("test123")).roles("ADMIN"));
        
        
    } 
}
