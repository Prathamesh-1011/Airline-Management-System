package com.airline.dto;

public class TicketDTO {
    private Long id;
    private String passengerName;
    private String email;
    private Long flightId;
    private String seatNumber;
    private String status;

    // ✅ Parameterized Constructor
    public TicketDTO(Long id, String passengerName, String email,
                     Long flightId, String seatNumber, String status) {
        this.id = id;
        this.passengerName = passengerName;
        this.email = email;
        this.flightId = flightId;
        this.seatNumber = seatNumber;
        this.status = status;
    }

    // ✅ Default Constructor
    public TicketDTO() {
    }

    // ✅ Getters
    public Long getId() { return id; }
    public String getPassengerName() { return passengerName; }
    public String getEmail() { return email; }
    public Long getFlightId() { return flightId; }
    public String getSeatNumber() { return seatNumber; }
    public String getStatus() { return status; }

    // ✅ Setters
    public void setId(Long id) { this.id = id; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }
    public void setEmail(String email) { this.email = email; }
    public void setFlightId(Long flightId) { this.flightId = flightId; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public void setStatus(String status) { this.status = status; }
}
