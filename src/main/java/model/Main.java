package model;

import model.entity.*;
import model.repository.*;
import model.repository.impl.*;

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
//        AirCompanyRepository airCompanyRepository = new AirCompanyRepositoryImpl();
//        AirCompany airCompany = airCompanyRepository.findId(1);
//        System.out.println(airCompany);
//        AirplaneRepository airplaneRepository = new AirplaneRepositoryImpl();
//        Airplane airplane = airplaneRepository.findId(6);
//        System.out.println(airplane);
//        CountryRepository countryRepository = new CountryRepositoryImpl();
//        Country country = countryRepository.findId(1);
//        City city = new City();
//        CityRepository cityRepository = new CityRepositoryImpl();
//        city.setCountryId(country);
//        cityRepository.save(city);
//        Role role = new Role();
//        RoleRepository roleRepository = new RoleRepositoryImpl();
//        roleRepository.save(role);
//        User user = new User();
//        user.setName("Mykhailo");
//        user.setSurname("Kadulin");
//        user.setRole(role);
//        UserRepository userRepository = new UserRepositoryImpl();
//        userRepository.save(user);
//        Login login = new Login();
//        login.setLogin("Mikesequell");
//        login.setPassword("Pass");
//        UserRepository userRepository = new UserRepositoryImpl();
//        User user = userRepository.findId(1);
//        login.setUser(user);
//        LoginRepository loginRepository = new LoginRepositoryImpl();
//        loginRepository.save(login);
//        Route route = new Route();
//        CityRepository arrivalRepository = new CityRepositoryImpl();
//        CityRepository departureRepository = new CityRepositoryImpl();
//        City arrivalCity = arrivalRepository.findId(1);
//        City departureCity = departureRepository.findId(3);
//        route.setDeparture(departureCity);
//        route.setArrival(arrivalCity);
//        RouteRepository routeRepository = new RouteRepositoryImpl();
//        routeRepository.save(route);
        Ticket ticket = new Ticket();
        ticket.setPassport("asd");
        ticket.setRouteId(new RouteRepositoryImpl().findId(6));
        ticket.setUserId(new UserRepositoryImpl().findId(1));
        TicketRepository ticketRepository = new TicketRepositoryImpl();
        ticketRepository.save(ticket);
    }
}
