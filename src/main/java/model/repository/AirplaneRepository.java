package model.repository;


import model.entity.Airplane;

import java.util.List;

public interface AirplaneRepository {

    void save(Airplane airplane);

    Airplane findId(int id);

    List<Airplane> findAll();

    void delete(Airplane airplane);
}
