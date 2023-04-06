package com.jherson.dSandA.linked_vs_array_List;

import com.jherson.Animal;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // Linked list

        startTime = System.nanoTime();

        // linkedList.get(0);
        // linkedList.get(500000);
        // linkedList.get(999999);
        // linkedList.remove(0);
        // linkedList.remove(500000);
        linkedList.remove(999999);
        // do something

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t " + elapsedTime + " ns");


        // Array list

        startTime = System.nanoTime();

        //arrayList.get(500000);
        // arrayList.get(999999);
        // arrayList.remove(0);
        // arrayList.remove(500000);
        arrayList.remove(999999);
        // do something

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t " + elapsedTime + " ns");




    }
}
