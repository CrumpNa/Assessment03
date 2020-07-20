package com.stayready.as03.problem02;
import java.util.Arrays;

public class Problem02 {

    public int findNumberOfNonMatching(int[] arr) {
        Arrays.sort(arr); //sort the arr of ints
        int n=arr.length; //arr size 
        int matches=0; //number of matches 
        int nonMatches=0; //number of non matches 
        //find out how many matches (matching ints) are in the array 

        for (int i=0;i<n; i++){ //will run thru the entire array 
            for (int j=i+1; j<n;j++){//will run thru the entire array comparing the 
            //rest of the array to the curr value elem in the 1st for loop 
                if(arr[i]==arr[j]){ //if curr value elem in 1st for loop equals num next to it
                    matches++; //add to the matches counter 
                    arr[i]=0; //change them to 0 so they aren't counted twice 
                    arr[j]=0; //like in a triplet, "marks them off" from being matched again 
                    break; //terinates if statement and picks up at i=1 and j=2, 
                    //even if like this--> 1,1,1 with changes will be -->0,0,1

                }else{
                    //do nothing but continue the for loop 
            }
        }
        }
        nonMatches=n-(matches*2); //length of array minus all matches 
        
        return nonMatches ;
    }

}

