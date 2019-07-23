
package hieu.GoogleDrivePermissionManagerV2.repository;

import hieu.GoogleDrivePermissionManagerV2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
