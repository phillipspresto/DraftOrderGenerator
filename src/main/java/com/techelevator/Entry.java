package com.techelevator;

public class Entry {
    private double accumulatedWeight;
    private String name;
    private int weight;



    public Entry(double accumulatedWeight, String name) {
        this.accumulatedWeight = accumulatedWeight;
        this.name = name;
    }

    public Entry(){};

    public double getAccumulatedWeight() {
        return accumulatedWeight;
    }

    public void setAccumulatedWeight(double accumulatedWeight) {
        this.accumulatedWeight = accumulatedWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = (int) weight;
    }
}
