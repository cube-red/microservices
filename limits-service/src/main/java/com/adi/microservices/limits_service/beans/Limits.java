package com.adi.microservices.limits_service.beans;

public class Limits {

    private int minumum;
    private int maximum;


    public int getMinumum() {
        return minumum;
    }

    public void setMinumum(int minumum) {
        this.minumum = minumum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public Limits(int minumum, int maximum) {
        this.minumum = minumum;
        this.maximum = maximum;
    }

    public Limits() {
    }
}
