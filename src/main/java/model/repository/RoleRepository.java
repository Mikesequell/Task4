package model.repository;

import model.entity.Role;

import java.util.List;

public interface RoleRepository {

    void save(Role role);

    Role findId(int id);

    List<Role> findAll();

    void delete(Role role);
}
