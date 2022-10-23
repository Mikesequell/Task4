package model.repository;

import model.entity.AirCompany;

import java.util.List;

public interface AirCompanyRepository {

    void save(AirCompany airCompany);

    AirCompany findId(int id);

    List<AirCompany> findAll();

    void delete(AirCompany airCompany);
}
