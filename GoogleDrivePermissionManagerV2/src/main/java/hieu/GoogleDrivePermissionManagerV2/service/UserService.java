
package hieu.GoogleDrivePermissionManagerV2.service;

import hieu.GoogleDrivePermissionManagerV2.model.User;

public interface UserService {
    
    public User findUserByName(String name);
    public User findUserByEmail(String email);
}
