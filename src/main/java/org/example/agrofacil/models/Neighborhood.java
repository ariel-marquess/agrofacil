package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Neighborhood implements Serializable {    // Classe Bairro do Diagrama de Classes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 8)
    private String CEP;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Neighborhood() {
    }

    public Neighborhood(String name, String CEP) {
        this.name = name;
        this.CEP = CEP;
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public City getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Neighborhood that = (Neighborhood) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(CEP, that.CEP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, CEP);
    }

    @Override
    public String toString() {
        return "Neighborhood{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", CEP='" + CEP + '\'' +
                '}';
    }
}
