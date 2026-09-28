package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@PrimaryKeyJoinColumn(name = "management_id")
public class Application extends Management {
    private Double areaApplied;

    @ManyToMany
    @JoinTable(name = "application_input",
            joinColumns = @JoinColumn(name = "application_id"),
            inverseJoinColumns = @JoinColumn(name = "input_id"))
    private List<Input> inputs = new ArrayList<>();

    public Application() {}

    public Application(Double areaApplied) {
        this.areaApplied = areaApplied;
    }

    public Double getAreaApplied() {
        return areaApplied;
    }

    public void setAreaApplied(Double areaApplied) {
        this.areaApplied = areaApplied;
    }

    public List<Input> listarInsumos() {
        return inputs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Application)) return false;
        if (!super.equals(o)) return false;
        Application that = (Application) o;
        return Objects.equals(areaApplied, that.areaApplied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), areaApplied);
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + getId() +
                ", areaApplied=" + areaApplied +
                '}';
    }
}
