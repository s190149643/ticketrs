package sa.edu.seu.ticketrs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sa.edu.seu.ticketrs.domain.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    
}
