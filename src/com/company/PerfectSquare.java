package com.company;

import java.util.Arrays;

public class PerfectSquare {

    public int sumSquares(int n){
        //Find the highest squares
        int count = 0;
        int sum = 0;
        int temp = 0;
        int j = 0;
        int[] pows = new int[n];
        for (int i = n; i > 0; i--) {
            int x = (int) Math.sqrt(i);
            if(Math.pow(x,2) == i){
                temp = i;
                pows[j] = temp;
                j++;
            }
        }
        //Now that we have the all the powers, get the powers that will add up to n

        for (int i = 0; i < pows.length-1 ; i++) {
            //Add up the powers starting from the largest
            if (pows[i] == n){
                return  1;
            }else if (sum == n){
                return count;
            } else if((sum < n) && (sum+pows[i] > n)){
                continue;
            }
            else if ((sum < n) && (pows[i] == 0)){
                i=i-2;
            }
            else {
                sum+=pows[i];
                count ++;
            }

        }
        return 0;
    }

}
