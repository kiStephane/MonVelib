package com.stephaneki.monvelib.modele;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Représente un station de vélo
 */
public class Station {

    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("contract_name")
    @Expose
    private String contractName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("position")
    @Expose
    private Position position;
    @SerializedName("banking")
    @Expose
    private Boolean banking;
    @SerializedName("bonus")
    @Expose
    private Boolean bonus;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("bike_stands")
    @Expose
    private Integer bikeStands;
    @SerializedName("available_bike_stands")
    @Expose
    private Integer availableBikeStands;
    @SerializedName("available_bikes")
    @Expose
    private Integer availableBikes;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Boolean getBanking() {
        return banking;
    }

    public void setBanking(Boolean banking) {
        this.banking = banking;
    }

    public Boolean getBonus() {
        return bonus;
    }

    public void setBonus(Boolean bonus) {
        this.bonus = bonus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBikeStands() {
        return bikeStands;
    }

    public void setBikeStands(Integer bikeStands) {
        this.bikeStands = bikeStands;
    }

    public Integer getAvailableBikeStands() {
        return availableBikeStands;
    }

    public void setAvailableBikeStands(Integer availableBikeStands) {
        this.availableBikeStands = availableBikeStands;
    }

    public Integer getAvailableBikes() {
        return availableBikes;
    }

    public void setAvailableBikes(Integer availableBikes) {
        this.availableBikes = availableBikes;
    }

}
