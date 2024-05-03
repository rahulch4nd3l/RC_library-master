package com.rahul.library.repository;

import com.rahul.library.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findRoleByRoleName(String roleName);

}
