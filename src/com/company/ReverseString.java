package com.company;

import java.util.Stack;

public class ReverseString {
    public String reverse(String n){
        //Do not use too much space and time

        Stack<String>stackResults = new Stack<>();
        String[] newN = n.split(" ");

        for(String i: newN){
            stackResults.push(i);
        }
        String results = "";
        //Fetch one by one.
        StringBuilder builder = new StringBuilder();
        int f = 0;
        while (f<=stackResults.size()){
            builder.append(stackResults.pop() + " ");
            results = builder.toString();
            f++;
        }

        return results;

    }
}
