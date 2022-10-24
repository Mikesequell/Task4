package model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryId")
    List<City> cities;

    @Override
    public String toString() {
        return "";
    }
}
