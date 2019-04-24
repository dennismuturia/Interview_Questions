package com.company;

public class NGE {
    public int[] nextGreaterElement(int[]arr){
        int[] results = new int[arr.length];
        int temp = 0;
        int j = 1;
        int k = 0;
        //Search the next greater element on the right side of the array
        while (k < arr.length){
            if (j> arr.length - 1){
                temp = -1;
                results[k] = temp;
                k++;
            }else {
                if (arr[j] > arr[k]){

                    temp = arr[j];
                    results[k] = temp;
                    k++;
                    if (k == 0){
                        j++;
                    }else {
                        j = k + 1;
                    }
                }else if (arr[k]> arr[j]){
                    j++;
                }
                else {
                    temp = -1;
                    results[k] = temp;
                }
            }

        }
        return results;
    }
}
