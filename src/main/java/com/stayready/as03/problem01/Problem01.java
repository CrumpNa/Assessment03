package com.stayready.as03.problem01;

public class Problem01 {

    public String isThisWeird(int input){
        String w=""; 
        if(input%2==1){
           w="Weird";}
        
        if(input%2==0 && input>=2 && input<=5){
            w="Not Weird";}
        if(input%2==0 && input>=6 && input<=20){
            w="Weird"; }
        if(input%2==0 && input>20){
            w="Not Weird";}
            return w; 
    }
}
