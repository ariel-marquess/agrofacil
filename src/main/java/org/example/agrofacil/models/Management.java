package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Management implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date executionDate;

    private String performedActivity;

    private String observations;

    @ManyToOne
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;

    @ManyToMany
    @JoinTable(name = "management_lot",
            joinColumns = @JoinColumn(name = "management_id"),
            inverseJoinColumns = @JoinColumn(name = "lot_id"))
    private List<Lot> lots = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "management_cultivar",
            joinColumns = @JoinColumn(name = "management_id"),
            inverseJoinColumns = @JoinColumn(name = "cultivar_id"))
    private List<Cultivar> cultivars = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "management_equipment",
            joinColumns = @JoinColumn(name = "management_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id"))
    private List<Equipment> equipments = new ArrayList<>();

    public Management() {}

    public Management(Date executionDate, String performedActivity, String observations, Farmer farmer) {
        this.executionDate = executionDate;
        this.performedActivity = performedActivity;
        this.observations = observations;
        this.farmer = farmer;
    }

    public Long getId() {
        return id;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public String getPerformedActivity() {
        return performedActivity;
    }

    public void setPerformedActivity(String performedActivity) {
        this.performedActivity = performedActivity;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public List<Lot> listarLotes() {
        return lots;
    }

    public List<Cultivar> listarCultivares() {
        return cultivars;
    }

    public List<Equipment> listarEquipamentos() {
        return equipments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Management that = (Management) o;
        return Objects.equals(id, that.id) && Objects.equals(executionDate, that.executionDate) && Objects.equals(performedActivity, that.performedActivity) && Objects.equals(observations, that.observations) && Objects.equals(farmer, that.farmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, executionDate, performedActivity, observations, farmer);
    }

    @Override
    public String toString() {
        return "Management{" +
                "id=" + id +
                ", executionDate=" + executionDate +
                ", performedActivity='" + performedActivity + '\'' +
                ", observations='" + observations + '\'' +
                ", farmer=" + farmer +
                '}';
    }
}
