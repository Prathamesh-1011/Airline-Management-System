package com.airline.entity;

import com.airline.entity.enums.FlightStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String flightNumber;

    private String origin;
    private String destination;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    @Enumerated(EnumType.STRING)
    private FlightStatus status;

    // ✅ Manual Getters
    public Long getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public FlightStatus getStatus() {
        return status;
    }

    // ✅ Optional: Add setters if needed for data manipulation
    public void setId(Long id) {
        this.id = id;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}
