package com.dsa.tree.binarySearchTree;

/**
 * This is the node class of Binary Search Tree
 */
public class BstNode
{
    private  int data;
    private  BstNode left;
    private  BstNode right;


    public  BstNode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public  BstNode(int data,BstNode left,BstNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BstNode getLeft() {
        return left;
    }

    public void setLeft(BstNode left) {
        this.left = left;
    }

    public BstNode getRight() {
        return right;
    }

    public void setRight(BstNode right) {
        this.right = right;
    }
}
