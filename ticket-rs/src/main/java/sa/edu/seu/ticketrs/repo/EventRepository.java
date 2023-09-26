package sa.edu.seu.ticketrs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sa.edu.seu.ticketrs.domain.Event;

//
public interface EventRepository extends JpaRepository<Event,Integer> {
    
    
}
