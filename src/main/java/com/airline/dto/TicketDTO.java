package com.airline.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDTO {
    private Long id;
    private String passengerName;
    private String email;
    private Long flightId;
    private String seatNumber;
    private String status;
}
