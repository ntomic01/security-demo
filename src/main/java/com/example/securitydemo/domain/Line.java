package com.example.securitydemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "line")
public class Line {

    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_destination_id")
    private Destination fromDestination;

    @ManyToOne
    @JoinColumn(name = "to_destionation_id")
    private Destination toDestination;




}
