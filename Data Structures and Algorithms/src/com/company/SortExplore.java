package com.company;

import java.util.Random;

public class SortExplore {
    public static void main(String[] args) {

        int numElements = 200000; // edit this to change number of elements in array

        // first to set up a sequence with random numbers
        Random generator = new Random();
        Sequence s = new Sequence(numElements);
        for (int i = 0; i < numElements; i++) {
            s.insertAt(i, generator.nextInt());
        }

        Sequence oldS = new Sequence(numElements); // will hold original sequence
        // now to make oldS a copy of s
        for (int i = 0; i < numElements; i++) {
            oldS.a[i] = s.a[i];
        }



        System.out.println("Before sorting by Insertion Sort");
        System.out.println("sequence is ascending?:  " + s.isAscending());
        // System.out.println(s);
        Sequence.clearNumSteps();
        System.out.println("STARTING Insertion Sort");
        s.insertionSort();
        System.out.println("Insertion Sort done");

        System.out.println("After sorting by Insertion Sort ");
        System.out.println("sequence is ascending?:  " + s.isAscending());
        System.out.println("Number of steps is: " + Sequence.getNumSteps());
        //  System.out.println(s);

        System.out.println("Before sorting by Insertion Sort");
        System.out.println("sequence is ascending?:  " + s.isAscending());
        // System.out.println(s);
        Sequence.clearNumSteps();
        System.out.println("STARTING Insertion Sort");
        s.insertionSort();
        System.out.println("Insertion Sort done");

        System.out.println("After sorting by Insertion Sort ");
        System.out.println("sequence is ascending?:  " + s.isAscending());
        System.out.println("Number of steps is: " + Sequence.getNumSteps());


        Sequence.clearNumSteps();
        System.out.println("Restoring unsorted sequence ");
        for (int i = 0; i < numElements; i++) { // restoring original s
            s.a[i] = oldS.a[i];
        }
        System.out.println("STARTING QuickSort");
        s.quickSort();
        System.out.println("QuickSort done");

        System.out.println("After sorting by QuickSort ");
        System.out.println("sequence is ascending?:  " + s.isAscending());
        System.out.println("Number of steps is: " + Sequence.getNumSteps());

        System.out.println("STARTING QuickSort");
        s.quickSort();
        System.out.println("QuickSort done");

        System.out.println("After sorting by QuickSort ");
        System.out.println("sequence is ascending?:  " + s.isAscending());
        System.out.println("Number of steps is: " + Sequence.getNumSteps());
    }
}
