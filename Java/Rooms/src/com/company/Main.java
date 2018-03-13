package com.company;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Room> rooms = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

    Main instance = new Main();
    instance.menu();


    }


    void menu(){
        System.out.println("menu enter  number go  to opschen -> 1 add rooms -> 2 display -> display all the rooms with projectors 3 ->  given a number of attendees and get rooms 4->");
        int num = input.nextInt();

        switch(num){
            case 1:
                addRome();
                menu();
                break;
            case 2 :
                display();
                menu();
                break;
            case 3:
                pordisplay();
                menu();
                break;
            case 4:
                numDisplay();
                menu();
                break;
            default:
                break;
        }
    }


    void addRome(){
        System.out.println("rome number to add -> ");
        int rNumber = input.nextInt();
        for ( int i=0; i<rNumber; i++) {
            System.out.println("to add offce enter 1 or to add lectuer room enter 2 or for computer room enter 3");
            int num = input.nextInt();
            switch (num){
                case 1:
                    String rm , name;
                    System.out.println("Name of person");
                    name = input.next();
                    System.out.println("Rome number");
                    rm = input.next();
                    rooms.add(new Office(rm,name));
                    break;

                case 2:
                    System.out.println("Rome cupasety");
                   int cup = input.nextInt();
                    System.out.println("Rome number");
                    String rn = input.next();
                    rooms.add(new LectureRoom(rn,cup));
                    break;
                case 3:

                    System.out.println("the OS ");
                    String os = input.next();
                    System.out.println("Rome number");
                    String um = input.next();
                    System.out.println("projeto true / false");
                    boolean pro = input.nextBoolean();
                    rooms.add(new ComputerLab(um,pro,os));
                    break;


            }


        }

    }
    void display(){


        for (Room r: rooms) {
            System.out.println("----------------------------------------");
            if(r instanceof Office) {
                System.out.println("Officeholder ->"+ (((Office) r)).getAttribute());
                //do something
            }
            System.out.println( "Rome Number ->" + r.getRoomNumber());
            System.out.println("Capacity ->" + r.getCapacity());
            System.out.println("has Projector  ->" + r.hasProjector());
            System.out.println("----------------------------------------");


        }
    }

    void pordisplay(){

        for (Room r: rooms) {
            if (r.hasProjector()){
                System.out.println("----------------------------------------");
                System.out.println("Rome Number " + r.getRoomNumber());
                System.out.println("Capacity " + r.getCapacity());
                System.out.println("----------------------------------------");

            }
        }
    }

    void numDisplay(){

        System.out.println("Capacity");
        int num = input.nextInt();
        for (Room r: rooms) {
            if (r.getCapacity() >= num ){
                System.out.println("----------------------------------------");
                System.out.println(r.getRoomNumber());
                System.out.println(r.getCapacity());
                System.out.println("----------------------------------------");
            }
        }

    }




}
