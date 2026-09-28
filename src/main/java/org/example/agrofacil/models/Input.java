package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Input implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

    @ManyToMany(mappedBy = "inputs")
    private List<Application> applications = new ArrayList<>();

    public Input() {}

    public Input(String name, Material material) {
        this.name = name;
        this.material = material;
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

    public Material getMaterial() {
        return material;
    }

    public List<Application> getApplications() {
        return applications;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Input input = (Input) o;
        return Objects.equals(id, input.id) && Objects.equals(name, input.name) && Objects.equals(material, input.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, material);
    }

    @Override
    public String toString() {
        return "Input{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", material=" + material +
                '}';
    }
}
