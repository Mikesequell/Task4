package model.repository;

import model.entity.City;
import model.entity.Country;

import java.util.List;

public interface CountryRepository {

    void save(Country country);

    Country findId(int id);

    List<Country> findAll();

    void delete(Country country);
}
