package sa.edu.seu.ticketrs.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

//mysql/oracle/sqlserer (SQL --> relational databases ) -> Java --> Object Oriented.
// SQL create table events ( id int primary key, name varachar(200))
// JPA  --> ORM --> HIBernate  Object relation 
// Java --> SQL ( Database Developer)
// 
@Entity
@Table(name="events") 
public class Event implements Serializable {

    @Id //pk 
    @Column(name="event_id")
    @GeneratedValue
    private int id; // id 

    @Column(name="event_name", length = 200)
    private String name;

    @Column(name="event_date")
    private LocalDate date;

    @Column(name = "event_time")
    private LocalTime time;
    
    @Column(name="location", length = 100)
    private String location;
    
    
    @OneToMany(mappedBy = "event")
    private Set<Ticket> tickets;


    @OneToMany(mappedBy = "event")
    private Set<TicketClass> ticketClasses;


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


    public LocalDate getDate() {
        return date;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }


    public LocalTime getTime() {
        return time;
    }


    public void setTime(LocalTime time) {
        this.time = time;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public Set<Ticket> getTickets() {
        return tickets;
    }


    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }


    public Set<TicketClass> getTicketClasses() {
        return ticketClasses;
    }


    public void setTicketClasses(Set<TicketClass> ticketClasses) {
        this.ticketClasses = ticketClasses;
    } 

    
}
