package com.airline.dto;

public class FlightDTO {
    private Long id;
    private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String status;

    // ✅ Parameterized Constructor
    public FlightDTO(Long id, String flightNumber, String origin, String destination,
                     String departureTime, String arrivalTime, String status) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
    }

    // ✅ Default Constructor (For frameworks like Jackson)
    public FlightDTO() {
    }

    // ✅ Getters
    public Long getId() { return id; }
    public String getFlightNumber() { return flightNumber; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }
    public String getStatus() { return status; }

    // ✅ Setters
    public void setId(Long id) { this.id = id; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
    public void setOrigin(String origin) { this.origin = origin; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }
    public void setArrivalTime(String arrivalTime) { this.arrivalTime = arrivalTime; }
    public void setStatus(String status) { this.status = status; }
}
