package com.company;



public class Supporter implements ISupporter {

    private  String id;
    private  String name;
    private  Supporter next;
    private  Supporter previous;



    public Supporter(String id, String name) {
        this.id = id;
        this.name = name;


    }

    @Override
    public String getID() {
        return this.id;
    }

    public Supporter getPrevious() {
        return previous;
    }

    public void setPrevious(Supporter previous) {
        this.previous = previous;
    }

    public Supporter getNext() {
        return next;
    }

    public void setNext(Supporter next) {
        this.next = next;
    }

    @Override
    public String getName() {

        return this.name;
    }

}
