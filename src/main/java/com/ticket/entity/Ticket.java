package com.ticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ticket {

    @Id
    private Long id;

    private String subject;
}
