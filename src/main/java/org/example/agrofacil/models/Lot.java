package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Lot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double area;

    @ManyToOne
    @JoinColumn(name = "ownership_id")
    private Ownership ownership;

    @ManyToMany
    @JoinTable(name = "lot_cultivar",
            joinColumns = @JoinColumn(name = "lot_id"),
            inverseJoinColumns = @JoinColumn(name = "cultivar_id"))
    private List<Cultivar> cultivars = new ArrayList<>();

    @ManyToMany(mappedBy = "lots")
    private List<Management> managements = new ArrayList<>();

    public Lot() {}

    public Lot(String name, Double area, Ownership ownership) {
        this.name = name;
        this.area = area;
        this.ownership = ownership;
    }

    public Long getId() {
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

    public Ownership getOwnership() {
        return ownership;
    }

    public List<Cultivar> getCultivars() {
        return cultivars;
    }

    public List<Management> getManagements() {
        return managements;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lot lot = (Lot) o;
        return Objects.equals(id, lot.id) && Objects.equals(area, lot.area) && Objects.equals(name, lot.name) && Objects.equals(ownership, lot.ownership);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, ownership);
    }

    @Override
    public String toString() {
        return "Lot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", ownership=" + ownership +
                '}';
    }
}
