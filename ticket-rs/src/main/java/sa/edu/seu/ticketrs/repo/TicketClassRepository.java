package sa.edu.seu.ticketrs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sa.edu.seu.ticketrs.domain.TicketClass;

public interface TicketClassRepository extends JpaRepository<TicketClass,Integer> {
    
}
