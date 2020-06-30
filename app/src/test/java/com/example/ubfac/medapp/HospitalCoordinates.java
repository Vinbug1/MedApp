package com.example.ubfac.medapp;

public class HospitalCoordinates {
    double lat;
    double lng;
    String hospitalName;

    public HospitalCoordinates() {
    }

    public HospitalCoordinates(double lat, double lng, String hospitalName) {
        this.lat = lat;
        this.lng = lng;
        this.hospitalName = hospitalName;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
