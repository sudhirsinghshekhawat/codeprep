package com.dsa.tree.binarySearchTree;

public class BstOperationMain
{

    public static void main(String[] args) {
        BstNode root = getBst();




    }


    public static BstNode getBst()
    {
        BstNode root = new BstNode(4);
        root.setLeft(new BstNode(2));
        root.setRight(new BstNode(6));

        BstNode left = root.getLeft();
        BstNode right = root.getRight();

        left.setLeft(new BstNode(1));
        left.setRight(new BstNode(3));

        right.setLeft(new BstNode(5));
        right.setRight(new BstNode(7));
        return  root;
    }

}
