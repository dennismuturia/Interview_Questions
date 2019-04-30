package com.company;

public class Permutation {
    //This class will find all the permutation present in a string

    String permute(String str, int l, int r){
        if(l == r){
            return str;
        }
        else {
            for (int i =l; i < r; i++){
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
        return "";

    }

    private String swap(String k, int i, int j){
        char temp;
        char[] charArray = k.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return  String.valueOf(charArray);
    }
}
