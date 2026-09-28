package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@PrimaryKeyJoinColumn(name = "management_id")
public class Planting extends Management {
    private Double areaPlanted;

    public Planting() {}

    public Planting(Double areaPlanted) {
        this.areaPlanted = areaPlanted;
    }

    public Double getAreaPlanted() {
        return areaPlanted;
    }

    public void setAreaPlanted(Double areaPlanted) {
        this.areaPlanted = areaPlanted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planting)) return false;
        if (!super.equals(o)) return false;
        Planting planting = (Planting) o;
        return Objects.equals(areaPlanted, planting.areaPlanted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), areaPlanted);
    }

    @Override
    public String toString() {
        return "Planting{" +
                "id=" + getId() +
                ", areaPlanted=" + areaPlanted +
                '}';
    }
}
