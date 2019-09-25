package com.dsa.tree.binarySearchTree;

import com.dsa.tree.binary.BinaryTreeNode;

public class BstOperation
{

    public BstNode getMinOfBstIterative(BstNode root)
    {
        if (root==null)
            return  null;
        while(root.getLeft()!=null)
            root = root.getLeft();
        return  root;
    }


    public BstNode getMinOfBst(BstNode root)
    {
        if(root==null)
            return null;
        else
        {
            if (root.getLeft()==null)
                return  root;
            else
                return  getMinOfBst(root.getLeft());
        }
    }

    public  BstNode getMaxOfBst(BstNode root)
    {
        if (root==null)
            return  null;
        else
        {
            if (root.getRight()==null)
                return  root;
            else
                return  getMaxOfBst(root.getRight());
        }
    }

    public BstNode getMaxOfBstIterative(BstNode root)
    {
        if (root==null)
            return  null;
        while (root.getRight()!=null)
            root = root.getRight();
        return  root;
    }



    public BstNode insert(BstNode root,int data)
    {
        if (root==null)
            root = new BstNode(data);
        else
        {
            if (data<root.getData())
                root.setLeft(insert(root.getLeft(),data));
            else if(data > root.getData())
                root.setRight(insert(root.getRight(),data));
        }
        return  root;

    }

























}
