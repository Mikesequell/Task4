package model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @OneToOne
    @JoinColumn(name = "route_id")
    Route routeId;
    @OneToOne
    @JoinColumn(name = "user_id")
    User userId;
    @Column(name = "passport")
    String passport;

}
