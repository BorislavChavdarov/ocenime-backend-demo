package com.ocenimmebackend.ocenimebackenddemo.models;


import jakarta.persistence.Entity;

import java.io.Serializable;


public class InputInfo implements Serializable {
    private String address;
    private String propertyType;
    private Double sqareMeters;
    private String buildingMaterial;
    private Integer yearOfConstruction;
    private Integer floor;
    private Integer floorsOfBuilding;
    private String furniture;
    private String condition;

    public InputInfo(String address, String propertyType, Double sqareMeters, String buildingMaterial, Integer yearOfConstruction, Integer floor, Integer floorsOfBuilding, String furniture, String condition) {
        this.address = address;
        this.propertyType = propertyType;
        this.sqareMeters = sqareMeters;
        this.buildingMaterial = buildingMaterial;
        this.yearOfConstruction = yearOfConstruction;
        this.floor = floor;
        this.floorsOfBuilding = floorsOfBuilding;
        this.furniture = furniture;
        this.condition = condition;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Double getSqareMeters() {
        return sqareMeters;
    }

    public void setSqareMeters(Double sqareMeters) {
        this.sqareMeters = sqareMeters;
    }

    public String getBuildingMaterial() {
        return buildingMaterial;
    }

    public void setBuildingMaterial(String buildingMaterial) {
        this.buildingMaterial = buildingMaterial;
    }

    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(Integer yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getFloorsOfBuilding() {
        return floorsOfBuilding;
    }

    public void setFloorsOfBuilding(Integer floorsOfBuilding) {
        this.floorsOfBuilding = floorsOfBuilding;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "InputInfo{" +
                "address='" + address + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", sqareMeters=" + sqareMeters +
                ", buildingMaterial='" + buildingMaterial + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                ", floor=" + floor +
                ", floorsOfBuilding=" + floorsOfBuilding +
                ", furniture='" + furniture + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
