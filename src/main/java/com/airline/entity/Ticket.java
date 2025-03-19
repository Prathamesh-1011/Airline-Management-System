package com.airline.entity;

import com.airline.entity.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
}
