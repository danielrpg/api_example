package com.api.songo.api.repository;

import com.api.songo.api.domain.Role;
import com.api.songo.api.domain.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
