package com.company;

public class Horse extends DomesticAnimal {
    private String color;

    public Horse(String nickName, String gender, int age, int weight,String color) {
        super(nickName, gender, age, weight);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
