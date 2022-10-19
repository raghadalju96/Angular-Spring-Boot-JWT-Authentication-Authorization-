package net.javaguides.springboot.repository;



import java.util.Optional;

import net.javaguides.springboot.models.ERole;
import net.javaguides.springboot.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}