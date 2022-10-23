package model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
//    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    @ManyToOne
    @JoinColumn(name = "airCompany_id")
    AirCompany airCompany;
    public String toString() {return "";}

}
