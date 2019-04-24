package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //Reverse String
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("Hello World"));


        /*
        //Perfect squares
        PerfectSquare perfectSquare = new PerfectSquare();
        System.out.println(perfectSquare.sumSquares(50));
        */
        /*
        //StockSpan
        StockSpan stockSpan = new StockSpan();
        int[] arr = new int[]{100, 80, 60, 70, 60, 75, 85};
        for (int i = 0; i <stockSpan.stockSpan(arr).length ; i++) {
            System.out.println(stockSpan.stockSpan(arr)[i]);
        }

        */

        /*
        //NGE
        NGE nge = new NGE();
        int[] arr = new int[]{11, 13, 21, 3};
        for (int i = 0; i <nge.nextGreaterElement(arr).length ; i++) {
            System.out.println(nge.nextGreaterElement(arr)[i]);
        }
         */

        /*
        //LinkedList
        LinkedList<String> object = new LinkedList<String>();
        object.add("A");
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");



        System.out.println("Linked List: "+ object);

        */




        /*
        //Custom made stack
        Stack<Integer>myStack = new Stack<Integer>(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(7);

        System.out.println(myStack);

        myStack.pop();

        System.out.println(myStack);

        System.out.println(myStack.peek());

        System.out.println(myStack);

        /*
	// Return the largest 3 items in an array
        int[] arr = new int[]{1, 23, 12, 9, 30, 2, 50};
        int[] results = items(arr);
        for (int i: results){
            System.out.println(i);
        }
         */

    }
    //Find the largest 3 items in the array
    static int[] items(int [] arr){
        //Sort the array
        Arrays.sort(arr);
        //Initialize an array
        int[] result = new int[3];
        int j = 0;
        //return the 3 items of the array
        for (int i = arr.length-1; i > arr.length - 4; i--) {

            int temp = arr[i];
            result[j] = temp;
            j++;
        }
        return result;
    }
}
