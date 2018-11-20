package com.company;
/* C Cox hash table with chaining */
import java.util.LinkedList;
import java.util.ListIterator;


public class Hash11 {


    private static void addStaff(LinkedList[] staff, String key) {
        final int HTS = 12; //hash table size
        if (!check(staff,key)) {
            staff[hash(key)].addLast(key);
        }
    }


    private static boolean check(LinkedList[] staff,String key){
        boolean b = false;
        if (staff[hash(key)].contains(key)){
            b = true;
        }
        return b;
    }


    private static void loadAndAverageChain(LinkedList[] staff){
        double x = 0;
        double y = 0;

        for (int i = 0; i < staff.length; i++){
            if (staff[i] != null){
                x++;
                y += staff[i].size();
            }
        }

        x = (x / (staff.length));
        y = ((y / x));


        System.out.println(x + "   "+ y);
    }


    private static int hash(String key) {
        final int HTS = 12; //hash table size
        return Math.abs(key.hashCode() % HTS);



    }




    public static void main(String[] args) {
        final int HTS = 12; //hash table size

        LinkedList[] staff = new LinkedList[HTS];
        for (int i = 0; i < HTS; i++)
            staff[i] = new LinkedList();
        addStaff(staff, "Sharon");
        addStaff(staff, "Chris");
        addStaff(staff, "Ian");
        addStaff(staff, "David");
        addStaff(staff, "Peter");
        addStaff(staff, "Muhammad");
        addStaff(staff, "Arantza");
        addStaff(staff, "Ken");
        addStaff(staff, "Richard");
        addStaff(staff, "Hong");
        addStaff(staff, "William");
        addStaff(staff, "Mark");
        addStaff(staff, "Bob");
        addStaff(staff, "Clare");
        addStaff(staff, "Faye");
        ListIterator iterator = staff[0].listIterator();

        for (int i = 0; i < HTS; i++) {
            iterator = staff[i].listIterator();
            System.out.print("staff[" + i + "]: ");
            while (iterator.hasNext())
                System.out.print(iterator.next() + " ");
            System.out.println();
        }
        loadAndAverageChain(staff);
    }
}

