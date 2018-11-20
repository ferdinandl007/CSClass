package com.company;



import java.beans.IntrospectionException;
import java.util.*;


public class SupporterDatabaseBST implements ISupporterDatabase {

    private class SearchTree {

        private Supporter data; // or whatever
        private SearchTree left , right;

        public SearchTree(Supporter data) {
            this.data = data;
            left = right = null;
        }

        public SearchTree getLeft() {
            return left;
        }

        public void setRight(SearchTree right) {
            this.right = right;
        }

        public void setData(Supporter data) {
            this.data = data;
        }

        public SearchTree getRight() {
            return right;
        }

        public void setLeft(SearchTree left) {
            this.left = left;
        }

        public Supporter getData() {
            return data;
        }

    }

    private SearchTree root;
    private int treeSize = 0;


    @Override
    public void clear() {
        root = null;
    }

    @Override
    public int size() {
        return treeSize;
    }

    @Override
    public Supporter get(String name) {
        if (root == null) return null;
        SearchTree loc = root; // start search downward at root
        int y = 0;
        boolean x = true;
        while (x) {
         if (name.compareTo(loc.getData().getName()) < 0) { // look left
                if (loc.getLeft() != null){
                    loc = loc.getLeft();
                    y++;
                } else  x=false;
            }
            else if (name.compareTo(loc.getData().getName()) > 0) { // look right
                if (loc.getRight() != null){
                    loc = loc.getRight();
                    y++;
                }else  x=false;
            }
            else if (name.equals(loc.getData().getName())){
             System.out.println("\nSupporter id " + loc.getData().getID() + " we visited "+y+"  notes before retrieving the supporter \n");
                x=false;
                return loc.getData();
            }
        }
        System.out.println("Supporter " +name + " was not found  \n  are you sure you entered the correct name");
        return null;


    }




    int maxDepth(SearchTree node){
        if (node == null)return 0;

        int lDepth = maxDepth(node.getLeft());
        int rDepth = maxDepth(node.getRight());
        return Math.max((lDepth + 1) ,(rDepth +1));

    }


    public static void printBinaryTree(SearchTree root, int level){
        if(root==null)
            return;
        printBinaryTree(root.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+root.getData().getName());
        }
        else
            System.out.println(root.getData().getName());
        printBinaryTree(root.left, level+1);
    }





    @Override
    public Supporter put(Supporter supporter) {
        if (root == null) { // must handle case of empty tree first
            root = new SearchTree(supporter);
            return null;
        }
        SearchTree loc = root; // start search downward at root
        int y = 0;
        boolean x = true;
        while (x) {
            if (supporter.getName().compareTo(loc.getData().getName()) < 0) { // look left
                if (loc.getLeft() != null) {
                    loc = loc.getLeft();
                    y++;
                } else {
                    loc.setLeft(new SearchTree(supporter));
                     x=false; treeSize++;
                }
            }
            else if (supporter.getName().compareTo(loc.getData().getName()) > 0) { // look right
                if (loc.getRight() != null){
                    loc = loc.getRight();
                    y++;
                } else {
                    loc.setRight(new SearchTree(supporter));
                    x=false; treeSize++;
                }
            }
            else x = false; // found! Don't insert
        }
        System.out.println("\n Supporter id " + supporter.getID() + " we visited "+ y+"  notes before inserting the supporter");
        System.out.println("tree has a size of " + treeSize + " and a depth of "+ maxDepth(root)+"\n");

        return null;

    }


    private void inorderT(SearchTree t) {
        if (t != null) {
            inorderT(t.getLeft());
            System.out.println(t.getData().getName() + " ");
            inorderT(t.getRight());
        }
    }

    @Override
    public void printSupportersOrdered() {
        inorderT(root);
       printBinaryTree(root,0);

    }

    @Override
    public boolean containsName(String name) {
        return get(name) != null;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }



    @Override
    public Supporter remove(String name) {

        root = removeSupporter(root,name);

        return null;
    }

    


    private SearchTree removeSupporter(SearchTree tree, String key){

        if (tree == null) return tree;


        if (key.compareTo(tree.getData().getName())<0){
             tree.setLeft(removeSupporter(tree.left,key));
            System.out.println("if 1");
        } else if (key.compareTo(tree.getData().getName())>0){
             tree.setRight(removeSupporter(tree.right,key));
            System.out.println("if 2");
        } else {
            System.out.println("else 1");
            if (tree.getLeft() == null){
                return tree.getRight();
            } else if (tree.getRight() == null) {
                return tree.getLeft();
            }

            tree.setData(minSupporter(tree.right));
            tree.setRight(removeSupporter(tree.right,tree.getData().getName()));


        }
        return tree;
    }


    Supporter minSupporter(SearchTree root){
        Supporter supporter = root.getData();
        while (root.getLeft() != null){
            supporter = root.left.getData();
            root = root.left;
        }
        return supporter;
    }

}
