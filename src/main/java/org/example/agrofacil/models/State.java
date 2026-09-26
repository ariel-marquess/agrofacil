package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class State implements Serializable {  // Classe Estado do Diagrama de Classes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 2)
    private String acronym;

    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> cities = new ArrayList<>();

    public State(){}

    public State(String name, String acronym) {
        this.name = name;
        this.acronym = acronym;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public List<City> getCities() {
        return cities;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return id == state.id && Objects.equals(name, state.name) && Objects.equals(acronym, state.acronym);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, acronym);
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acronym='" + acronym + '\'' +
                '}';
    }
}
