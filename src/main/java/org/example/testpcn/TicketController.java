package org.example.testpcn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    TicketRepository repository;

    // places ticket from user into server
    @PostMapping("/postTickets")
    public void addTickets(Ticket newTicket) {
        repository.addTicket(newTicket);
    }

    // updates ticket with id
    @PostMapping("/updateTicket")
    public void updateTicket(Ticket updatedTicket) {
        repository.updateTicket(updatedTicket);
    }

    // returns tickets to user
    @GetMapping("/getTickets")
    public List<Ticket> returnTickets() {
        return repository.getTickets();
    }

    // delete tickets
    @DeleteMapping("/deleteTickets")
    public void deleteTickets() {
        repository.deleteTickets();
    }

    // deletes all tickets
    @DeleteMapping("/deleteTicket")
    public void deleteticket(@RequestParam long id) {
        repository.deleteTicket(id);
    }

}