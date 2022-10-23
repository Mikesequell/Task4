package model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToMany(cascade = CascadeType.ALL)
    int id;
}
