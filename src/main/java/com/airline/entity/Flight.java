package com.airline.entity;

import com.airline.entity.enums.FlightStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
}
