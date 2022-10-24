package model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne
    @JoinColumn(name = "country_id")
    Country countryId;

    @Override
    public String toString() {
        return "";
    }
}
