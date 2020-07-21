package com.stayready.as03.problem05;

public class BlueJay extends Bird {
    String color;
    int speed;

    public void color(String expected){
        this.color = color;
    }

    public String color(){
        color="blue";
        return color;

    }

    public int speed(){
        speed=13;
        return speed;
    }
}

