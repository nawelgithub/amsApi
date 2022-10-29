package com.sid.amsapi.repositories;

//import java.util.List;
//import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sid.amsapi.entities.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);
//List<Role> findByRole(Set<Role> roles); 
}
