package model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    String login;
    @Column
    String password;
    @OneToOne
    @JoinColumn(name = "user_id")
    User user;


}
