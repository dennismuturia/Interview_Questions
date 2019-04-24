package com.company;

import java.util.LinkedList;

public class LinkedListNew {
    //Reverse a linked list for every k nodes
    public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> arr){

        int temp = 0;
        int temp1 = 0;
        int theSize =0;
        int index1 = 0;
        int iterate = 3; //Will keep on updating

        while (theSize<arr.size()){

            if ((iterate%3 == 0) && (index1%3 == 0)){

                temp = arr.get(iterate--);

                temp1 = arr.get(index1++);

                arr.add(index1, temp);
                arr.add(iterate, temp1);
                iterate = iterate + 3;
                index1 = iterate - 3;
                theSize++;

            }



        }

        return arr;
    }


}
