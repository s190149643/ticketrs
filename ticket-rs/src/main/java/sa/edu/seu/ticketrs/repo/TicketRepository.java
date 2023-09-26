package sa.edu.seu.ticketrs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sa.edu.seu.ticketrs.domain.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
    
}
