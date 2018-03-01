package com.company;

public class Student {


    private int number;
    private String name;
    private String course;
    private Module[] studying;
    private int numModules;

    public Student(String sName, int number) {
        name = sName;
        this.number = number;
        studying = new Module[5];
        numModules=0;
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
        studying[numModules] =m;
        numModules++;
    }
    /* @pre: 0 <= pos && pos < numStudying

  @post student now not studying module at position pos in
      their programme
 */
    public void deleteModule(int pos) {
        int i = pos;
        while (i<numModules-1) {
            studying[i] = studying[i+1]; // copy down
            i++;
        } // i == numStudying-1
        numModules--; // one less now
    }


    public void displayModules() {
        for (int i = 0; i<numModules; i++){
            System.out.println("Module " + studying[i].getName());
        }

    }


}
