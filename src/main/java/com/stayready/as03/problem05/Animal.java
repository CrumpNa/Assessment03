package com.stayready.as03.problem05;

public interface Animal {
    String move();
    int getSpeed();
    String color();
}


/*
Create the following animals:

Horse is a concrete class which implements Animal.
move will return the string "gallop"
color will return the string "brown" (Yes I am aware not all horses are brown.)
getSpeed will return 40
Bird is an abstract class that implements Animal.
move will return the string "fly" (Yes I am aware not all birds fly.)
BlueJay is a concrete class which extends from Bird
color will return the string "blue"
speed will return 13
RedRobin is a concrete class which extends from Bird
color will return the string "red"
speed will return 10
Add a String migrationMonth field. Add a getter and setter for it.
Section 2: Speed Comparator*/ 