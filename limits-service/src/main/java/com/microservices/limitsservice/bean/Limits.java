package com.microservices.limitsservice.bean;

public class Limits {
    private int minimum;
    private int maximum;

    public Limits() {
        super();
    }

    public Limits(int minimum, int maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    // Getter for minimum
    public int getMinimum() {
        return minimum;
    }

    // Setter for minimum
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    // Getter for maximum
    public int getMaximum() {
        return maximum;
    }

    // Setter for maximum
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}

