package org.example.agrofacil.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Location implements Serializable {  // Classe Localização do Diagrama de Classes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String address;

    @Column(length = 100)
    private String complement;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToOne(mappedBy = "location", orphanRemoval = true)
    private Association association;

    @OneToOne(mappedBy = "location", orphanRemoval = true)
    private Ownership ownership;

    private Double latitude;
    private Double longitude;

    public Location() {}

    public Location(String number, String address, String complement, City city, Double latitude, Double longitude) {
        this.number = number;
        this.address = address;
        this.complement = complement;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Association getAssociation() {
        return association;
    }

    public Ownership getOwnership() {
        return ownership;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return id == location.id && Objects.equals(number, location.number) && Objects.equals(address, location.address) && Objects.equals(complement, location.complement) && Objects.equals(city, location.city) && Objects.equals(latitude, location.latitude) && Objects.equals(longitude, location.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, address, complement, city, latitude, longitude);
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", complement='" + complement + '\'' +
                ", city=" + city +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
