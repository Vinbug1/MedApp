package com.example.ubfac.model;

import java.util.ArrayList;

public class LGAs {
    String state;
    String stateId;
    String name;
    int value;
    ArrayList<Hospital> Hospital;

    public LGAs() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Hospital> getHospital() {
        return Hospital;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        Hospital = hospital;
    }

    @Override
    public String toString() {
        return "LGAs{" +
                "state='" + state + '\'' +
                ", stateId='" + stateId + '\'' +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", Hospital=" + Hospital +
                '}';
    }
}
