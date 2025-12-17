package br.com.alura.dojoplaces.Local;

import java.time.LocalDateTime;

public class LocalWithLastUpdateDTO {
    Long id;
    String name;
    String code;
    String neighborhood;
    String city;
    LocalDateTime dateCreation;
    LocalDateTime dataUpdate;
    String lastUpdate;
    String creationDate;

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public LocalDateTime getDataUpdate() {
        return dataUpdate;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDataUpdate(LocalDateTime dataUpdate) {
        this.dataUpdate = dataUpdate;
    }
}
