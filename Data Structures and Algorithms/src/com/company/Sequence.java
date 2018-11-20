package com.company;

public class Sequence {
    static long stepCount = 0;

    public static void clearNumSteps() {
        stepCount = 0;
    }

    public static long getNumSteps() {
        return stepCount;
    }
    public final int max;
    public int[] a;

    public Sequence(int max) {
        a = new int[max];
        this.max = max;
    }

    // pre 0 <= i && i < max
    // a[i] == x
    public void insertAt(int i, int x) {
        a[i] = x;
    }

    public String toString() {
        String out = "";
        for (int elem : a) {
            out += elem + "\n";
        }
        return out;
    }

    public boolean isAscending() {
        int i = 1;
        while (i < max && a[i - 1] <= a[i]) {
            i++;
        }
        return i >= max;
    }

    // pre true
    // post a[0..size-1] is ascending
    void insertionSort() {
        int i = 1;
        int x;
        int j;
        while (i < a.length) {
            // a[0..i-1] is ascending
            // insert value at a[i] into correct position in a[0..i-1]
            j = i;
            x = a[i]; // x is the value originally at a[i]
            stepCount++;
            while (j != 0 && a[j - 1] > x) {
                // 'budge up' values that are bigger than the one at a[i]
                a[j] = a[j - 1];
                j--;
                stepCount++;
            }  // j == 0 OR a[j-1] <= x
            // 'drop in' x, the value that was at a[j]
            a[j] = x;
            i++; // advance to insert next value
            stepCount++;
        } // i >= a.length
    } // end of insertionSort

    void qSort(int low, int high) {
        int i = low, j = high, temp;
        int pivot = a[(low + high) / 2];
        stepCount++;
        while (i < j) {
            while (a[i] < pivot) {
                i++;
                stepCount++;
            }
            while (a[j] > pivot) {
                j--;
                stepCount++;
            }
            if (i <= j) {
                temp = a[i];
                stepCount++;
                a[i] = a[j];
                stepCount++;
                a[j] = temp;
                stepCount++;
                i++;
                j--;
            }


        }
        if (low < j) {
            qSort(low, j); // recursive call
        }
        if (i < high) {
            qSort(i, high); // recursive call
        }


    } // end of insertionSort

    // pre true
    // post a[0..size-1] is ascending
    void quickSort() {
        qSort(0, max - 1);
    } // end of QSort
}
