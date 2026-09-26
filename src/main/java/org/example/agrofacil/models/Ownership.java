package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Ownership implements Serializable {  // Classe Propriedade do Diagrama de Classes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double area;

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

    public Ownership(){}

    public Ownership(String name, Double area, Farmer farmer, Location location) {
        this.name = name;
        this.area = area;
        this.farmer = farmer;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ownership ownership = (Ownership) o;
        return id == ownership.id && Objects.equals(name, ownership.name) && Objects.equals(area, ownership.area) && Objects.equals(farmer, ownership.farmer) && Objects.equals(location, ownership.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, farmer, location);
    }

    @Override
    public String toString() {
        return "Ownership{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", farmer=" + farmer +
                ", location=" + location +
                '}';
    }
}
