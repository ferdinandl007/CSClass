package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    static String[] lastName =  { "Anderson", "Ashwoon", "Aikin", "Bateman", "Bongard", "Bowers", "Boyd", "Cannon", "Cast", "Deitz", "Dewalt", "Ebner", "Frick", "Hancock", "Haworth", "Hesch", "Hoffman", "Kassing", "Knutson", "Lawless", "Lawicki", "Mccord", "McCormack", "Miller", "Myers", "Nugent", "Ortiz", "Orwig", "Ory", "Paiser", "Pak", "Pettigrew", "Quinn", "Quizoz", "Ramachandran", "Resnick", "Sagar", "Schickowski", "Schiebel", "Sellon", "Severson", "Shaffer", "Solberg", "Soloman", "Sonderling", "Soukup", "Soulis", "Stahl", "Sweeney", "Tandy", "Trebil", "Trusela", "Trussel", "Turco", "Uddin", "Uflan", "Ulrich", "Upson", "Vader", "Vail", "Valente", "Van Zandt", "Vanderpoel", "Ventotla", "Vogal", "Wagle", "Wagner", "Wakefield", "Weinstein", "Weiss", "Woo", "Yang", "Yates", "Yocum", "Zeaser", "Zeller", "Ziegler", "Bauer", "Baxster", "Casal", "Cataldi", "Caswell", "Celedon", "Chambers", "Chapman", "Christensen", "Darnell", "Davidson", "Davis", "DeLorenzo", "Dinkins", "Doran", "Dugelman", "Dugan", "Duffman", "Eastman", "Ferro", "Ferry", "Fletcher", "Fietzer", "Hylan", "Hydinger", "Illingsworth", "Ingram", "Irwin", "Jagtap", "Jenson", "Johnson", "Johnsen", "Jones", "Jurgenson", "Kalleg", "Kaskel", "Keller", "Leisinger", "LePage", "Lewis", "Linde", "Lulloff", "Maki", "Martin", "McGinnis", "Mills", "Moody", "Moore", "Napier", "Nelson", "Norquist", "Nuttle", "Olson", "Ostrander", "Reamer", "Reardon", "Reyes", "Rice", "Ripka", "Roberts", "Rogers", "Root", "Sandstrom", "Sawyer", "Schlicht", "Schmitt", "Schwager", "Schutz", "Schuster", "Tapia", "Thompson", "Tiernan", "Tisler" };
    static String[] NameUUID = new String[150];
    static String[] lastNamer  = {  "Thompson","Ory","Eastman","Anderson","McGinnis","Doran","Cast","Schiebel","Hesch","Deitz", "Dewalt", "Ebner", "Frick", "Hancock",};
    public static void main(String[] args) {
       test();
    }



    private static void test(){

        SupporterDatabaseHT tabel = new SupporterDatabaseHT("1");
        //SupporterDatabaseBST tabel = new SupporterDatabaseBST();

        for (int i = 0; i < 12  ; i++){
            Supporter supporter = new Supporter(UUID.randomUUID().toString(),lastNamer[i]);

            tabel.put(supporter);

            if (i == 5){
                tabel.remove("Thompson");
                tabel.remove("Ory");
            }

        }
        tabel.printSupportersOrdered();
        System.out.println("\n \n \n \n");
        tabel.printSupportersOrdered();




        for (int i = 0; i < 12; i++){

            Supporter r = tabel.get(lastNamer[i]);
            if (r != null){
                System.out.println(r.getName() +" and ID "+ r.getID());
          }else {
              System.out.println("Supporter not found ------------> " + lastNamer[i]);
            }

        }





    }



    private static void testHash(){
        // write your code here
        int[] has = new int[lastName.length];
        int[] has2 = new int[lastName.length];
        for (int i = 0; i < 150; i++){
            NameUUID[i] = UUID.randomUUID().toString();
        }


        for (int i = 0; i < lastName.length; i++){
            has[i] = hash(lastName[i]);
            has2[i] = getKeyIndex(lastName[i]);
        }
        int h1 = 0;
        int h2 = 0;
        for (int i = 0; i < lastName.length; i++){
            for (int x = i; x < lastName.length; x++){
                if (has[i] == has[x] && i != x) {
                    h1++;
                    System.out.println("Clash with  the "+lastName[i]+" and "+lastName[x]+" "+ has[i] + " "+ has[x]);
                }
                if (has2[i] == has2[x] && i != x) {
                    //h2++;
                   // System.out.println("Clash with  the "+lastName[i]+" and "+lastName[x]+" "+ has2[i] + " "+ has2[x]);
                }
            }

        }

        System.out.println("number of names -> " + lastName.length);
        System.out.println("algorithm one number of clashes -> " + h1);
        //System.out.println("algorithm two number of clashes -> " + h2 );
    }

    // winning function
    private static int getKeyIndex(String key) {
        int hash = 7;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash*31 + key.charAt(i)/2)%400;
        }
        return hash;
    }


    private static int hash(String key)
    { final int HTS = 400; //hash table size
        int hash_value = 0;
        for(int j=0; j<key.length(); j++)
            hash_value=hash_value+(int)key.charAt(j);
        hash_value = (hash_value % HTS);
        return hash_value;
    }

}
