package sa.edu.seu.ticketrs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sa.edu.seu.ticketrs.domain.Event;
import sa.edu.seu.ticketrs.repo.EventRepository;


// --> database 
// --> dal ( data access layer.) ( repository )
// --> service ( business logic)
// --> controller ( )
// --> view () 

@Service
public class EventService {
    
    @Autowired
    private EventRepository repo;

    //list of events.
    public List<Event> getAllEvents()
    {
        return this.repo.findAll();
    }

    public Optional<Event> findById(Integer id)
    {
        return this.repo.findById(id);
    }

    public Event save(Event entity)
    {
        return this.repo.save(entity);
    }

    public void deleteById(Integer id) {
        this.repo.deleteById(id);
    }
    
    

}
