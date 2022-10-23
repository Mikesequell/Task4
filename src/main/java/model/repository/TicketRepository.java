package model.repository;


import model.entity.Ticket;

import java.util.List;

public interface TicketRepository {
    void save(Ticket ticket);

    Ticket findId(int id);

    List<Ticket> findAll();

    void delete(Ticket ticket);
}
