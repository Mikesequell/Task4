package model.repository;


import model.entity.User;

import java.util.List;

public interface UserRepository {

    void save(User user);

    User findId(int id);

    List<User> findAll();

    void delete(User user);
}
