package com.stayready.as03.problem05;

public class RedRobin extends Bird{
    String migrationMonth;
    String color;
    int speed;

    public String color(){
        color= "red";
        return color;
    }

    public int speed(){
        speed=10;
        return speed;
    }



    public void setMigrationMonth(String expected){
        this.migrationMonth=expected;
    }

    public String getMigrationMonth(){
        return migrationMonth;
    }
}


