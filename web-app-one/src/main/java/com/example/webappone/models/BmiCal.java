package com.example.webappone.models;

import org.springframework.context.annotation.Bean;

public class BmiCal {

    private double height;
    private double weight;

    public BmiCal(double height, double weight) {
        setHeight(height);
        setWeight(weight);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getBmi(double height , double weight){
        return weight / height;
    }


}
