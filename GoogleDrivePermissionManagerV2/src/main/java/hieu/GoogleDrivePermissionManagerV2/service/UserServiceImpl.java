
package hieu.GoogleDrivePermissionManagerV2.service;

import hieu.GoogleDrivePermissionManagerV2.model.User;
import hieu.GoogleDrivePermissionManagerV2.repository.RoleRepository;
import hieu.GoogleDrivePermissionManagerV2.repository.UserRepository;
import java.util.HashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Override
    public User findUserByName(String name) {
        List<User> list = userRepository.findAll();
        
        for(User u : list){
            if(u.getName().equals(name)){
                return u;
            }
        }
        
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        List<User> list = userRepository.findAll();
        
        for(User u : list){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        
        return null;
    }
    
    public User saveUser(User u){
        u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
        u.setRoles(new HashSet<>(roleRepository.findAll()));
        
        return userRepository.saveAndFlush(u);
    }
    
}
