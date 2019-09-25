package com.dsa.tree.binary;

public class BinaryTreeMain
{
    public static void main(String[] args)
    {

        BinaryTreeNode root = getBinaryTree();

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();

        System.out.println("Recursive Pre Order Traversal");
        binaryTreeTraversal.preOrder(root);
        System.out.println("\nIterative Pre  Order Traversal");
        binaryTreeTraversal.preOrderIterative(root);

        System.out.println("\nRecursive In Order Traversal");
        binaryTreeTraversal.inOrder(root);
        System.out.println("\nIterative In Order Traversal");
        binaryTreeTraversal.inOrderIterative(root);

        System.out.println("\nRecursive Post Order Traversal");
        binaryTreeTraversal.postOrder(root);
        System.out.println("\nIterative post Order Traversal");
        binaryTreeTraversal.postOrderIterative(root);
        System.out.println("\nIterative post Order using one stack Traversal ");
        binaryTreeTraversal.postOrderOneStack(root);

        System.out.println("\nlevel Order Traversal");
        binaryTreeTraversal.levelOrderTraversal(root);












    }

    public static BinaryTreeNode getBinaryTree()
    {
        BinaryTreeNode root = new BinaryTreeNode(null,null,1);
        BinaryTreeNode left = new BinaryTreeNode(null,null,2);
        BinaryTreeNode right = new BinaryTreeNode(null,null,3);

        root.setLeft(left);
        root.setRight(right);

        BinaryTreeNode left1 = new BinaryTreeNode(null,null,4);
        BinaryTreeNode right1 = new BinaryTreeNode(null,null,5);

        left.setLeft(left1);
        left.setRight(right1);

        BinaryTreeNode left2 = new BinaryTreeNode(null,null,6);
        BinaryTreeNode right2 = new BinaryTreeNode(null,null,7);

        right.setLeft(left2);
        right.setRight(right2);

        right2.setLeft(new BinaryTreeNode(null,null,8));

        return  root;
    }
}
