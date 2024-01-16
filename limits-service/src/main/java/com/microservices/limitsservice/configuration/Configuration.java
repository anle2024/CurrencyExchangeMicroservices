package com.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int minimum;
    private int maximum;

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
