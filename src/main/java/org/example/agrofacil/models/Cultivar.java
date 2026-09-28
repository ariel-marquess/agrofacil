package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Cultivar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "cultivar_category",
            joinColumns = @JoinColumn(name = "cultivar_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories = new ArrayList<>();

    @ManyToMany(mappedBy = "cultivars")
    private List<Lot> lots = new ArrayList<>();

    @ManyToMany(mappedBy = "cultivars")
    private List<Management> managements = new ArrayList<>();

    public Cultivar() {}

    public Cultivar(String name) {
        this.name = name;
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

    public List<Category> listarCategorias() {
        return categories;
    }

    public List<Lot> getLots() {
        return lots;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cultivar cultivar = (Cultivar) o;
        return Objects.equals(id, cultivar.id) && Objects.equals(name, cultivar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Cultivar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
