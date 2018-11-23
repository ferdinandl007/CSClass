package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SupporterDatabaseHT implements ISupporterDatabase {

    private  String name;
    // initialise array of HashEntry (table)
    private Supporter[] table;
    private Boolean[] lazyDeletion;
    private int tableSize;
    private Double entries = 0.0;


    public SupporterDatabaseHT(String name){
        // create array of HashEntry, predefined size
        this.tableSize =3;
        System.out.println("size of hash table --> " + size());
        this.name = name;
        table = new Supporter[size()];
        lazyDeletion = new Boolean[size()];
        Arrays.fill(lazyDeletion,false);

    }





    private int getKeyIndex(String key) {
        int hash = 7;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash*31 + (key.charAt(i)) / 2 )%size();
        }
        return hash;
    }


    @Override
    public void clear() {
        tableSize = 9;
        table =  new Supporter[size()];
    }

    @Override
    public boolean containsName(String name) {
        return  get(name) !=  null;
    }

    @Override
    public Supporter get(String name) {

        int i = getKeyIndex(name), h = 1;
        while (table[i] != null ) {
            if (table[i].getName().equals(name) && !lazyDeletion[i]) {
                System.out.println("value retrieved from hash table");
                return table[i];

            }
            i = (i + h * h++) % size();
            //System.out.println("i "+ i);
            if(h > size() * 4){
                makeNewtable();
            }
        }
        System.out.println("value not found in hash table");
        return null;
    }

    @Override
    public int size() {
        return tableSize;
    }




    @Override
    public boolean isEmpty() {
        System.out.println("checked if tables is empty");
        return entries == 0;
    }




    private void makeNewtable(){
        tableSize = tableSize * 2;
        Supporter[] tepTable = table;
        table =  new Supporter[size()];
        entries = 0.0;
        for (int i = 0; i < tepTable.length; i++){
            if (tepTable[i] != null && !lazyDeletion[i]){
                put(tepTable[i]);
            } else if (lazyDeletion[i]){
                System.out.println("--------------------------------------------------------------> Deleted name was excluded from new table." + tepTable[i].getName());
            }
        }
        lazyDeletion = new Boolean[size()];
        Arrays.fill(lazyDeletion,false);

    }

    @Override
    public Supporter put(Supporter supporter) {

        if ((entries / size()) >= 0.75) {
            System.out.println("--------------------------------------------------------------> new hash table is created and an old one is copied over");
            System.out.println("--------------------------------------------------------------> previous Size "+size() +" and load factor"+ (entries / size()));
            makeNewtable();
            System.out.println("--------------------------------------------------------------> New Size "+size() +" and load factor"+ (entries / size()));
        }


        System.out.println("\nEntry in hash table is made Current load factor -> " + (entries / size()) + " and  " + entries +" entries");
        System.out.println ("Supporter name -> "+ supporter.getName() + ", "+ "hash value -> " + getKeyIndex(supporter.getName()) + ", "+ " buckets visited -> ");

        int tmp = getKeyIndex(supporter.getName());
        int i = tmp, x = 1;
        do {
            if (table[i] == null) {
                table[i] = supporter;
                entries++;
                System.out.println(", in bucket -> " + i + ", ");
                return null;
            }
            if (table[i].getName().equals(supporter.getName())) {
                table[i] = supporter;
                System.out.println(", in bucket -> " + i + ", ");
                return null;
            }
            i = (i + x * x++) % size();
            System.out.print(i +", ");

            if(x > size() * 4){
                makeNewtable();
            }
        } while (i != tmp);
        return null;
    }

    @Override
    public Supporter remove(String name) {

        int i = getKeyIndex(name), h = 1;
        while (table[i] != null) {
            if (table[i].getName().equals(name)) {
                lazyDeletion[i] = true;
                return table[i];
            }
            i = (i + h * h++) % size();
        }
        return null;

    }

    @Override
    public void printSupportersOrdered() {
        ArrayList<Supporter> supportersAy = new ArrayList<Supporter>();
        for (int i = 0; i < table.length; i++){
            if (table[i] != null && !lazyDeletion[i]){
                supportersAy.add( table[i]);
            }
        }
        StringQuickSort QuickSort = new StringQuickSort();
        Supporter[] stockArr = new Supporter[supportersAy.size()];
        stockArr = supportersAy.toArray(stockArr);
        stockArr = QuickSort.QuickSorts(stockArr);
        for (Supporter bob : stockArr) {
             System.out.println(bob.getName());
        }
    }
}
