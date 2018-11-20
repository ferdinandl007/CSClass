package com.company;

public class StringQuickSort {
    Supporter names[];
    int length;

    void sort(Supporter array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    public Supporter[] QuickSorts(Supporter[] supporters) {
        StringQuickSort sorter = new StringQuickSort();
        Supporter namse[] = supporters;
        sorter.sort(namse);
        return supporters;

    }


    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        Supporter pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].getName().compareToIgnoreCase(pivot.getName()) < 0) {
                i++;
            }

            while (this.names[j].getName().compareToIgnoreCase(pivot.getName()) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        Supporter temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}

