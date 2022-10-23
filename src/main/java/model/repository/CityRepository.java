package model.repository;


import model.entity.City;

import java.util.List;

public interface CityRepository {

    void save(City city);

    City findId(int id);

    List<City> findAll();

    void delete(City city);
}
