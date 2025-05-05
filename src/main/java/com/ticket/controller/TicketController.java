package com.ticket.controller;

import com.ticket.entity.Ticket;
import com.ticket.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ticket")
@RestController
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;

    @PostMapping("/")
    private ResponseEntity createTicket(@RequestBody Ticket ticket){
        ticketRepository.save(ticket);
        return ResponseEntity.ok().build();
    }
}
