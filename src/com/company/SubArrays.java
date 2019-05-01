package com.company;

import java.util.ArrayList;
import java.util.List;

class SubArrays {
    //Finding the subarray given the sum
    int[] findSum(int[] a, int sum){
        int t = 0;
        List<Integer>resIds = new ArrayList<>();
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == sum){
                    resIds.add(a[i]);
                    resIds.add(a[j]);
                }else if((i == a.length-1)&& (j == a.length-1) && (a[i] + a[j] <= sum)){
                    i = t;
                    //redo the array

                }
            }
        }
        return null;
    }


}
