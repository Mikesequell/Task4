package model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "uname")
    String name;
    @Column(name = "usurname")
    String surname;
    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role;
}
