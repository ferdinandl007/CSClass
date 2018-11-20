package com.company;

import java.util.Set;

public class GeneralUtilities {
    /**
     * Perform a depth first traversal of a graph, printing out the
     * name of each node visited
     * @param g Graph to be traversed
     * @param startName Name of the first person to be printed out
     */
    public static void depthFirstTraversal(FriendsGraph g, String startName) {
        System.out.println(g);

    }

    private static void dft(FriendsGraph g, int i, Set<Integer> visited) {
        System.out.println(g);
        visited.add(i);
        for (g.getSize())



    }
}
