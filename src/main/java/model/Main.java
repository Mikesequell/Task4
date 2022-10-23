package model;

import model.entity.AirCompany;
import model.entity.Airplane;
import model.repository.AirCompanyRepository;
import model.repository.AirplaneRepository;
import model.repository.impl.AirCompanyRepositoryImpl;
import model.repository.impl.AirplaneRepositoryImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//    Airplane airplane = new Airplane();
//    AirplaneRepository airplaneRepository = new AirplaneRepositoryImpl();
//    airplane.setAirCompany(new AirCompanyRepositoryImpl().findId(2));
//    airplaneRepository.save(airplane);

//    AirCompanyRepository airCompanyRepository = new AirCompanyRepositoryImpl();
//    airCompanyRepository.save(new AirCompany());
//        System.out.println(new AirCompanyRepositoryImpl().findAll());
        AirCompanyRepository airCompanyRepository = new AirCompanyRepositoryImpl();
        AirCompany airCompany = airCompanyRepository.findId(1);
        System.out.println(airCompany);
        AirplaneRepository airplaneRepository = new AirplaneRepositoryImpl();
        Airplane airplane = airplaneRepository.findId(6);
        System.out.println(airplane);
    }
}
