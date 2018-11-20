package com.company;

import java.io.*;

/** A program for playing with graphs representing networks of friends.
  */
public class NotFacebook {

    // Change this startFolder variable to (e.g. "C:\\Documents and Settings\\me\\program")
    // or wherever you have put your graph files, in order to get the file chooser to
    // start in the folder - note that in Java strings, \ is an escape character, so
    // to get a single \, you need to write \\ in the pathname of the folder.
    private static String startFolder = ".";


/** Creates and displays a graph, then runs assorted methods on the graph.
  *
  * @param args  command-line arguments (ignored)
  */
    public static void main(String[] args) {

       File f = GraphUtilities.getGraphFile(startFolder); // uses a file chooser to select a file
       FriendsGraph g = GraphUtilities.readInGraph(f); // reads the file to create a graph

        if (g.areFriends("Remi","Victoria"))
            System.out.println("Remi and Victoria are friends.");
        else
            System.out.println("Remi and Victoria are not friends.");



       GraphUtilities.showGraph(g); // pop-up window displaying the graph
    }


}