package com.stayready.as03.problem00;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/*Given a string like that that is is that that is not is not is that it it is wutang

Count the number of unique words, and how many times the occur.

The 4 unique words are:
that (Seen 5)
is (Seen 5)
not (Seen 2)
wutang (Seen 1)*/


public class Problem00 {
    public String countUniqueWords(String input){
        String str[] = input.split(" ");
        List<String> s= new ArrayList<String>();
        s = Arrays.asList(str);//convert string to arraylist
        Collections.sort(s);  //sort it alphabetically bc runtime of for loop will be lowered
        int counter=0; 
        for (int i=1; i<s.size();i++){
            counter=0; 
            if(s.get(0)==s.get(i)){
                counter++; 
                s.remove(i); 
            }
            s.remove(0); 
            counter++; 
            System.out.print("word"+ s.get(i)+" :"+counter); 
             
        }
       
        //double for loop and see if i==j
        //append j to an array and remove j if so 
        //then in 1st for loop append remove i and then  will move on to next i 
        //
        

        return null;
    }
}
