package com.example.securitydemo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ticketBus")
public class TicketBus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "departure_id")
    private Departure departure;

    @ManyToOne
    @JoinColumn(name = "system_user_id")
    private SystemUser systemUser;
}
