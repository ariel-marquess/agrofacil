package org.example.agrofacil.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Farmer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false, unique = true)
    @Email(message = "O termo informado pe inválido.")
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)  // Define que a senha nunca será serealizada numa resposta da API
    private String password;

    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "workers_id")
    private Workers workers;

    @OneToMany(mappedBy = "farmer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ownership> ownerships = new ArrayList<>();

    public Farmer(){}

    public Farmer(String name, String cpf, String email, String phone, Date dateOfBirth, String password, Association association, Group group) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.association = association;
        this.group = group;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Association getAssociation() {
        return association;
    }

    public Group getGroup() {
        return group;
    }

    public Workers getWorkers() {
        return workers;
    }

    public List<Ownership> getOwnerships() {
        return ownerships;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Farmer farmer = (Farmer) o;
        return Objects.equals(id, farmer.id) && Objects.equals(name, farmer.name) && Objects.equals(cpf, farmer.cpf) && Objects.equals(email, farmer.email) && Objects.equals(phone, farmer.phone) && Objects.equals(dateOfBirth, farmer.dateOfBirth) && Objects.equals(password, farmer.password) && Objects.equals(association, farmer.association) && Objects.equals(group, farmer.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, email, phone, dateOfBirth, password, association, group);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", password='" + password + '\'' +
                ", association=" + association +
                ", group=" + group +
                '}';
    }
}
