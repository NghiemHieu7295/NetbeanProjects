
package hieu.GoogleDrivePermissionManagerV2.config;

import hieu.GoogleDrivePermissionManagerV2.model.Role;
import hieu.GoogleDrivePermissionManagerV2.model.User;
import hieu.GoogleDrivePermissionManagerV2.service.UserServiceImpl;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userServiceImpl.findUserByName(username);
        
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for(Role r : u.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(r.getName()));
        }
        
        return new org.springframework.security.core.userdetails.User(u.getName(), u.getPassword(), 
                grantedAuthorities);
    }
    
}
