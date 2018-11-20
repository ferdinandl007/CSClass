package com.company;

public class TreeNavigator {

    /**
     * Print out a preorder traversal of a binary tree
     *
     * @param t root of the tree to be traversed
     */
    public static void preOrderTraversal(BinaryTree t) {
        if (t != null) {
            System.out.println(t.data);
            preOrderTraversal(t.left);
            preOrderTraversal(t.right);
        }
    }

    /**
     * Print out a postorder traversal of a binary tree
     *
     * @param t root of the tree to be traversed
     */
    public static void postOrderTraversal(BinaryTree t) {
        if (t != null) {
            postOrderTraversal(t.left);
            postOrderTraversal(t.right);
            System.out.println(t.data);
        }
    }

    /**
     * Print out a inorder traversal of a binary tree
     *
     * @param t root of the tree to be traversed
     */
    public static void inOrderTraversal(BinaryTree t) {
        if (t != null) {
            inOrderTraversal(t.left);
            System.out.println(t.data);
            inOrderTraversal(t.right);

        }
    }

    /**
     * Count the leaves on a binary tree
     * @param t root of the tree to be examined
     * @return the number of leaves in the tree
     */
    public static int leafCount(BinaryTree t) {
        if (t == null) {
            return 0;
        } if (t.right == null && t.left == null) {
            return 1;
        } else {
            return leafCount(t.left) + leafCount(t.right);
        }
    }

    /**
     * Find the depth of a binary tree
     * @param t the root of the tree to be examined
     * @return depth of the tree
     */
    public static int depth(BinaryTree t) {
        if (t == null) {
            return -1;
        } else {
            return 1 + Math.max(depth(t.right),depth(t.left));

        }
    }


    public static boolean strictlyBinary(BinaryTree t) {
       if (t == null){
           return true;
       }

       if (t.left == null && t.right == null) {
           return true;
       }

        if((t.left!=null) && (t.right!=null)) {
            return (strictlyBinary(t.left) && strictlyBinary(t.right));
        }
        // if none work
        return false;
    }

}
