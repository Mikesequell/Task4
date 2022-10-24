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
    @JoinColumn(name = "departure")
    City departure;
    @OneToOne
    @JoinColumn(name = "arrival")
    City arrival;
}
