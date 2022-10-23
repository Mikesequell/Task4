package model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class AirCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aircompany_id")
    int id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "airCompany")
    List<Airplane> airplanes;

    public String toString() {return "";}

}
