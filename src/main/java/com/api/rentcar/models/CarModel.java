package com.api.rentcar.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cars")
public class CarModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCodeCar;


    @Column(nullable = false)
    private String brand;
    
    @Column(nullable = false)
    private String model;
    
    @Column(nullable = false)
    private String color;
    
    
    @Column(nullable = false, length = 14)
    private String licensePlate;
    
    @OneToMany(mappedBy = "tb_cars")
    private Set<RentingContractModel> lodgers = new HashSet<>();

    public Long getIdCodeCar() {
        return idCodeCar;
    }

    public void setIdCodeCar(Long idCodeCar) {
        this.idCodeCar = idCodeCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Set<RentingContractModel> getLodgers() {
        return lodgers;
    }

    public void setLodgers(Set<RentingContractModel> lodgers) {
        this.lodgers = lodgers;
    }

    // Get e Setter

}
