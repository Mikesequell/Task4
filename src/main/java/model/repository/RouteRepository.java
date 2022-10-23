package model.repository;

import model.entity.Route;

import java.util.List;

public interface RouteRepository {
    void save(Route route);

    Route findId(int id);

    List<Route> findAll();

    void delete(Route route);
}
