package com.company;


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private ArrayList<Room> rooms = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here







    }


    void menu(){
        System.out.println("menu enter  number go  to opschen -> 1 add rooms -> 2 display -> display all the rooms with projectors 3 ->  given a number of attendees and get rooms 4->");
        int num = input.nextInt();
        boolean boo = true;
        while (boo)
        switch(num){
            case 1:
                addRome();
                break;
            case 2 :
                display();
                break;
            case 3:
                pordisplay();
                break;
            case 4:
                numDisplay();
                break;
            default:
                boo = false;
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
                    System.out.println("projeto yes / no");
                    boolean pro = input.nextBoolean();
                    rooms.add(new ComputerLab(um,pro,os));
                    break;

            }


        }

    }
    void display(){
        for ( int i=0; i<rooms.size(); i++) {
            System.out.println(rooms.get(i).getRoomNumber());
            System.out.println(rooms.get(i).getCapacity());
            System.out.println(rooms.get(i).hasProjector());
        }
    }

    void pordisplay(){
        for ( int i=0; i<rooms.size(); i++) {
            if (rooms.get(i).hasProjector()){
               System.out.println(rooms.get(i).getRoomNumber());
            }
        }
    }

    void numDisplay(){

        System.out.println("Capacity");
        int num = input.nextInt();
        for ( int i=0; i<rooms.size(); i++) {
            if (rooms.get(i).getCapacity() >= num ){
                System.out.println(rooms.get(i).getRoomNumber());
            }
        }

    }




}
