package sa.edu.seu.ticketrs.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sa.edu.seu.ticketrs.domain.Event;
import sa.edu.seu.ticketrs.service.EventService;

@RequestMapping("/events")
@Controller
public class EventController {
    
    @Autowired
    private EventService eventsService;

    @GetMapping // html page
    public String list(Model model) {
        // select * from events;
        var events = eventsService.getAllEvents();
        model.addAttribute("events", events);
        return "events/list";
    }

    // Add Event.
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("event", new Event());
        return "events/create";
    }

    @PostMapping("/create")
    public String add(@ModelAttribute("event") Event event, Model model,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("event", event);
            return "events/create";
        }
        this.eventsService.save(event);
        return "redirect:/events";
    }

    // Edit Event.
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")Integer id, Model model) {
        if (id == null) {
            return "not_found";
        }

        // select * from events where id = " + id;
        Optional<Event> event = this.eventsService.findById(id);
        if (event.isEmpty()) {
            return "not_found";
        }
        model.addAttribute("event", event.get());
        return "events/edit";

    }

    @PostMapping("/edit")
    public String update(@ModelAttribute("event") Event event, Model model) {
        if (event == null || event.getId() <= 0) {
            return "not_found";
        }
        Optional<Event> old = this.eventsService.findById(event.getId());
        if (old.isEmpty()) {
            return "not_found";
        }
        Event update = old.get();
        update.setLocation(event.getLocation());
        update.setName(event.getName());
        this.eventsService.save(update);
        return "redirect:/events";

    }

    // Delete Event.
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        
        Optional<Event> event = this.eventsService.findById(id);
        if (event.isEmpty()) {
            return "not_found";
        }
        model.addAttribute("event", event.get());
        return "events/delete";

    }

    @PostMapping("/delete/{id}")
    public String deleteConfirmed(@PathVariable("id") Integer id) {

        this.eventsService.deleteById(id);

        return "redirect:/events";
    }
}
    
