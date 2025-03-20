package com.airline.entity;

import com.airline.entity.enums.TicketStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "TICKET")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @Column(nullable = false, unique = true)
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    // ✅ Constructors
    public Ticket() { }

    public Ticket(Long id, String passengerName, String email, Flight flight,
                  String seatNumber, TicketStatus status) {
        this.id = id;
        this.passengerName = passengerName;
        this.email = email;
        this.flight = flight;
        this.seatNumber = seatNumber;
        this.status = status;
    }

    // ✅ Getters
    public Long getId() { return id; }
    public String getPassengerName() { return passengerName; }
    public String getEmail() { return email; }
    public Flight getFlight() { return flight; }
    public String getSeatNumber() { return seatNumber; }
    public TicketStatus getStatus() { return status; }

    // ✅ Setters
    public void setId(Long id) { this.id = id; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }
    public void setEmail(String email) { this.email = email; }
    public void setFlight(Flight flight) { this.flight = flight; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public void setStatus(TicketStatus status) { this.status = status; }
}
