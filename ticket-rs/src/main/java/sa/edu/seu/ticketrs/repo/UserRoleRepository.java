package sa.edu.seu.ticketrs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sa.edu.seu.ticketrs.domain.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {
    
}
