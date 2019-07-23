
package hieu.GoogleDrivePermissionManagerV2.repository;

import hieu.GoogleDrivePermissionManagerV2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    
}
