package com.dsa.tree.binary;

public class TreeOperationMain {
    public static void main(String[] args) {

        BinaryTreeNode root = BinaryTreeMain.getBinaryTree();
        TreeOperation treeOperation = new TreeOperation();
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();

        System.out.println("--------max in tree----------");
        int maxInTree = treeOperation.maxInTree(root);
        System.out.println("Max in Tree(Recursive) : " + maxInTree);
        System.out.println("zigzag\n");
        treeOperation.zigZagTraverSal(root);

        maxInTree = treeOperation.maxInTreeIterative(root);
        System.out.println("Max in Tree(Iterative) : " + maxInTree);
        System.out.println("----------------------------");

        System.out.println("Height of Binary Tree : "+treeOperation.heightOfBinaryTree(root));

        System.out.println("----Recursive Search--------");
        System.out.println("Search in BT : 5 : "+treeOperation.findInBT(root,5));
        System.out.println("Search in BT : 8 : "+treeOperation.findInBT(root,8));
        System.out.println("Search in BT : 9 : "+treeOperation.findInBT(root,9));

        System.out.println("----Iterative Search--------");
        System.out.println("Search in BT : 5 : "+treeOperation.findInBTIterative(root,5));
        System.out.println("Search in BT : 8 : "+treeOperation.findInBTIterative(root,8));
        System.out.println("Search in BT : 9 : "+treeOperation.findInBTIterative(root,9));

        System.out.println("----Insert Into BT --------");
        treeOperation.insertIntoBT(root,9);
        binaryTreeTraversal.levelOrderTraversal(root);
        System.out.println("\n----------------------------");
        System.out.println("Size of  BT  : "+ treeOperation.sizeOfBT(root));







    }
}
