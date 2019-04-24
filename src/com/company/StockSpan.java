package com.company;

import java.util.Stack;
public class StockSpan {
    //This is a stock span problem
    //Calculate the values that are less and equal to the current.


    //This solution is n^2
    public int[] stockSpan(int[]arr){
        int[] results = new int[arr.length];
        int j = 0;
        int temp = 0;
        int sum = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            int count = 0;
            for (int k = 0; k <= i ; k++) {
                //Go backwards
                    if(arr[k] <= arr[i]){
                        try {
                            if(arr[i -1] > arr[i]){
                                count = 1;
                                temp = count;
                                results[i] = temp;
                            }else{
                                count+=1;
                                temp = count;
                                results[i] = temp;
                            }
                        }catch (Exception e){
                            count = 1;
                            temp = count;
                            results[i] = temp;
                        }
                    }
                }
            }


        //return an array
        return results;
    }
    //Use atack
    public int[] calculateSpan(int[] arr){

        int[] S = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        S[0] = 1;

        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] <= arr[i])
                st.pop();

            S[i] = (st.empty()) ? (i +1) : (i - st.peek());

            st.push(i);
        }

        return S;

    }

}
