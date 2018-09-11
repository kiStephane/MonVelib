package com.stephaneki.monvelib.modele;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Contract {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("commercial_name")
    @Expose
    private String commercialName;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("cities")
    @Expose
    private List<String> cities = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

}
