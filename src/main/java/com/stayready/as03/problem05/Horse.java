package com.stayready.as03.problem05;

public class Horse implements Animal {
    public String move(){
        String mvmt= "gallop";
        return mvmt; 
    } 
    public String color(){
        String color="brown"; 
        return color; 
    }

    public int getSpeed(){
        int speed=40; 
        return speed; 
    }
}
