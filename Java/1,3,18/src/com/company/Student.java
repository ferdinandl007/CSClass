package com.company;
import java.util.ArrayList;
public class Student {


    private int number;
    private String name;
    private String course;
    private ArrayList<Module> studying;
    private int numModules;

    public Student(String sName, int number) {
        name = sName;
        this.number = number;

        studying = new ArrayList<>();
        numModules = 0;
    }

    public void changeCourse(String nCourse) {
        course = nCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addModule(Module m) {
        studying.add(m);
    /* @pre: 0 <= pos && pos < numStudying

  @post student now not studying module at position pos in
      their programme
 */
    }
        public void deleteModule ( int pos){
            studying.remove(pos);
        }


        public void displayModules () {
            for (int i = 0; i < numModules; i++) {
                System.out.println("Module " + studying.get(i).getName());
            }

        }



}