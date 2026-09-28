package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@PrimaryKeyJoinColumn(name = "management_id")
public class Harvest extends Management {
    private Integer quantity;

    @ManyToMany
    @JoinTable(name = "harvest_unit",
            joinColumns = @JoinColumn(name = "harvest_id"),
            inverseJoinColumns = @JoinColumn(name = "unit_id"))
    private List<Unit> units = new ArrayList<>();

    public Harvest() {}

    public Harvest(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Unit> listaUnidades() {
        return units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Harvest)) return false;
        if (!super.equals(o)) return false;
        Harvest harvest = (Harvest) o;
        return Objects.equals(quantity, harvest.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity);
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "id=" + getId() +
                ", quantity=" + quantity +
                '}';
    }
}
