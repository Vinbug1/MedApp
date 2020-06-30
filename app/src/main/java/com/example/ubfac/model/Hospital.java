package com.example.ubfac.model;

import com.google.gson.annotations.SerializedName;

public class Hospital {
    String latitude;
    String longitude;
    String name;
    @SerializedName("desc")
    String description;
    double distance;

    public Hospital(){}

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", distance=" + distance +
                '}';
    }
}
