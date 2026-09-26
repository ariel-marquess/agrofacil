package org.example.agrofacil.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Association implements Serializable {  // Classe Associação do Diagrama de Classes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, length = 14)
    private String cnpj;

    @Column(nullable = false, unique = true)
    @Email(message = "O termo informado é inválido.")
    private String email;

    @Column(nullable = false)
    private String phone;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "association", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Group> groups = new ArrayList<>();

    @OneToMany(mappedBy = "association", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Farmer> farmers = new ArrayList<>();

    public Association() {}

    public Association(String name, String cnpj, String email, String phone, Location location) {
        this.name = name;
        this.cnpj = cnpj;
        this.email = email;
        this.phone = phone;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Farmer> getFarmers() {
        return farmers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Association that = (Association) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(cnpj, that.cnpj) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cnpj, email, phone, location);
    }

    @Override
    public String toString() {
        return "Association{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", location=" + location +
                '}';
    }
}
