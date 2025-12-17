package br.com.alura.dojoplaces.Local;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String neighborhood;
    private String city;
    private LocalDateTime dateCreation;
    private LocalDateTime dataUpdate;

    public Local(Long id, String name, String code, String neighborhood, String city, LocalDateTime dataUpdate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.neighborhood = neighborhood;
        this.city = city;
        this.dateCreation = LocalDateTime.now();
        this.dataUpdate = dataUpdate;
    }

    public Local() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(LocalDateTime dataUpdate) {
        this.dataUpdate = dataUpdate;
    }
}
