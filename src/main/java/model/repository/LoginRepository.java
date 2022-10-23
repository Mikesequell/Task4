package model.repository;


import model.entity.Login;

import java.util.List;

public interface LoginRepository {

    void save(Login login);

    Login findId(int id);

    List<Login> findAll();

    void delete(Login login);
}
