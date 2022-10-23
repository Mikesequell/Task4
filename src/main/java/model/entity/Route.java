package model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToOne
    @JoinColumn(name = "id")
    City departure;
    @OneToOne
    @JoinColumn(name = "id")
    City arrival;
}
