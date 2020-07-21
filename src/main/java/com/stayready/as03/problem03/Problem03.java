package com.stayready.as03.problem03;
import java.util.Arrays;
import java.lang.*;

public class Problem03 {
    public String isPalindrome(String input){
    char[] c= input.toCharArray(); //convert string to char array 
   Arrays.sort(c); //sort the char array in alpha order 
   int sameLetter=0; //keeps track of how many of ea letter in the string 
   int oddLetters=0; //counts the number of letters that have odd occurences, should only be one letter that has an odd occurence 
   String palindrome="NO"; //will change based off of if statements 
    for (int i=0;i<c.length-2;i++){
      for(int j=1;j<c.length-1;j++){
        if(c[i]==c[j]){
          sameLetter++; 
        }
        if(sameLetter%2==0){
          palindrome="YES";
          sameLetter=0; 
        }else{
          oddLetters++; 
            if(oddLetters>1){
              palindrome="NO"; 
            }
          
        }
      }
    }
   return palindrome; 
    }
}
