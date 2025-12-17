package br.com.alura.dojoplaces.Local;

import jakarta.validation.constraints.*;

public class LocalDTO {

    @NotEmpty
    @Size(min = 1, max = 100)
    private String name;
    @Size(min = 1, max = 100)
    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String code;
    @NotEmpty
    private String neighborhood;
    @NotEmpty
    private String city;

    public LocalDTO(String name, String code, String neighborhood, String city) {
        this.name = name;
        this.code = code;
        this.neighborhood = neighborhood;
        this.city = city;
    }

    public LocalDTO() {
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
