package sa.edu.seu.ticketrs.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;


@Entity
@Table(name="tickets")
public class Ticket implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name="ticket_id")
    private int id;

    @Column(name="event_id")
    private int eventId;

    @ManyToOne
    @JoinColumn(name="event_id", insertable = false,updatable = false)
    private Event event;

    @Column(name="user_id")
    private int userId;
    
    @ManyToOne
    @JoinColumn(name="user_id", insertable = false, updatable = false)
    private User user;


    @Column(name="status")
    private TicketStatus status;

    @Column(name="price")
    private BigDecimal price = new BigDecimal(0);//default 0;


    @Column(name="class_id")
    private int ticketClassId;

    @ManyToOne
    @JoinColumn(name="class_id", insertable = false,updatable = false)
    private TicketClass ticketClass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getTicketClassId() {
        return ticketClassId;
    }

    public void setTicketClassId(int ticketClassId) {
        this.ticketClassId = ticketClassId;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }

    

}
