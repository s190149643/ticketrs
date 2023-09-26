package sa.edu.seu.ticketrs.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket_classes")
public class TicketClass implements Serializable {
    //event --> 1200 
    @Id
    @GeneratedValue
    @Column(name="class_id")
    private int id;

    @Column(name="class_name", length = 100)
    private String name;

    @Column(name="price")
    private BigDecimal price;

    @Column(name = "number_of_tickets")
    private int numberOfTickets;

    @Column(name="event_id")
    private int eventId;

    @ManyToOne
    @JoinColumn(name="event_id",insertable = false, updatable = false)
    private Event event;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}
