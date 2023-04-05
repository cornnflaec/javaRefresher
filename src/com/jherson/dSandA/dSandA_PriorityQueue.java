package com.jherson.dSandA;

import java.util.*;

public class dSandA_PriorityQueue {
    public static void main(String[] args) {

        //Priority Queue = A FIFO data structure that serves elements
        //                             with the highest priorities first
        //				  before elements with lower priority

        //Strings in default order

        // Queue<Double> queue = new LinkedList<>();
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);


        while(!queue.isEmpty()){
            System.out.println(queue.poll());

           /*

           Linked List : new LinkedList<>();
            3.0
            2.5
            4.0
            1.5
            2.0

           Priority Queue : new PriorityQueue<>();
            1.5
            2.0
            2.5
            3.0
            4.0

            you can also reverse it using PriorityQueue<>(Comparator.reverseOrder());
            Collections.reverseOrder()

           */



        }



    }



}
