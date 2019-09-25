package com.dsa.tree.binary;

import javax.swing.plaf.LabelUI;
import java.util.*;

public class TreeOperation {

    //max in binary tree Recursive way
    public int maxInTree(BinaryTreeNode root) {
        if (root == null)
            return 0;

        int leftMax = maxInTree(root.left);
        int rightMax = maxInTree(root.right);

        int max = Math.max(leftMax, rightMax);
        return Math.max(max, root.data);
    }


    //max in binary tree in non recursive way
    public int maxInTreeIterative(BinaryTreeNode root) {
        Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();

        int max = Integer.MIN_VALUE;

        if (root == null)
            return 0;
        binaryTreeNodeQueue.offer(root);
        while (!binaryTreeNodeQueue.isEmpty()) {
            BinaryTreeNode temp = binaryTreeNodeQueue.poll();
            max = Math.max(max, temp.data);

            if (temp.left != null)
                binaryTreeNodeQueue.offer(temp.left);
            if (temp.right != null)
                binaryTreeNodeQueue.offer(temp.right);
        }
        return max;
    }


    //Height of Binary Tree
    public int heightOfBinaryTree(BinaryTreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        return 1 + Math.max(leftHeight, rightHeight);

    }


    //find in binary tree
    public boolean findInBT(BinaryTreeNode root, int data) {
        if (root == null)
            return false;
        if (root.getData() == data)
            return true;
        return findInBT(root.left, data) || findInBT(root.right, data);
    }

    //find in binary Tree Iterative way
    public boolean findInBTIterative(BinaryTreeNode root, int data) {
        if (root == null)
            return false;

        Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();
        binaryTreeNodeQueue.offer(root);

        while (!binaryTreeNodeQueue.isEmpty()) {
            BinaryTreeNode temp = binaryTreeNodeQueue.poll();
            if (temp.data == data)
                return true;

            if (temp.left != null)
                binaryTreeNodeQueue.offer(temp.left);
            if (temp.right != null)
                binaryTreeNodeQueue.offer(temp.right);
        }

        return false;
    }

    //Insert Into Binary Tree
    public void insertIntoBT(BinaryTreeNode root, int data) {
        if (root == null) {
            root = new BinaryTreeNode(null, null, data);
        } else {

            Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();
            binaryTreeNodeQueue.offer(root);

            while (!binaryTreeNodeQueue.isEmpty()) {
                BinaryTreeNode temp = binaryTreeNodeQueue.poll();
                if (temp.left != null) {
                    binaryTreeNodeQueue.offer(temp.left);

                } else {
                    temp.setLeft(new BinaryTreeNode(null, null, data));
                    return;
                }
                if (temp.right != null) {
                    binaryTreeNodeQueue.offer(temp.right);

                } else {
                    temp.setRight(new BinaryTreeNode(null, null, data));
                    return;
                }
            }
        }
    }

    //size of Binary Tree
    public int sizeOfBT(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int leftSize = sizeOfBT(root.left);
        int rightSize = sizeOfBT(root.right);
        return 1 + leftSize + rightSize;
    }

    //find the LCA of Binary Tree
    public BinaryTreeNode LCA(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        if (root == null)
            return null;
        if (root == node1 || root == node2)
            return root;
        BinaryTreeNode left = LCA(root.left, node1, node2);
        BinaryTreeNode right = LCA(root.right, node1, node2);

        if (left != null && right != null)
            return root;

        return left != null ? left : right;
    }

    //diameter of Binary Tree
    public int diameterOfBinaryTree(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        int diameter = Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
        return diameter;
    }

    //build a binary tree from preOrder and InOrder Traversal
    public BinaryTreeNode buildBinaryTree(int[] preOrder, int[] inOrder) {
        if (preOrder.length == 0 || inOrder.length != preOrder.length)
            return null;
        return buildBT(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    //building a binary tree from preOrder and InOrder data
    public BinaryTreeNode buildBT(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
            return null;
        int data = preOrder[preStart];
        BinaryTreeNode curr = new BinaryTreeNode(null, null, data);
        int offset = inStart;
        for (; offset < inEnd; offset++) {
            if (inOrder[offset] == data)
                break;
        }

        curr.left = buildBT(preOrder, preStart + 1, preStart + offset - inStart, inOrder, inStart, offset - 1);
        curr.right = buildBT(preOrder, preStart + offset - inStart + 1, preEnd, inOrder, offset + 1, inEnd);
        return curr;
    }

    //mirror of Binary Tree
    public BinaryTreeNode mirrorOfBinaryTree(BinaryTreeNode root) {
        BinaryTreeNode temp;
        if (root != null) {
            mirrorOfBinaryTree(root.left);
            mirrorOfBinaryTree(root.right);
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        return root;
    }

    //are mirror of binary tree
    public boolean areMirrors(BinaryTreeNode root1, BinaryTreeNode root2) {

        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.data != root2.data)
            return false;
        else
            return areMirrors(root1.left, root2.right) && areMirrors(root1.right, root2.left);
    }


    //zigzag traversal of Binary Tree
    public void zigZagTraverSal(BinaryTreeNode root) {
        ArrayList<Integer> zigZagList = new ArrayList<>();

        boolean leftToRight = true;

        if (root != null) {
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            ArrayList<Integer> curr = new ArrayList<>();

            queue.offer(root);
            queue.offer(null);

            while (!queue.isEmpty()) {

                BinaryTreeNode temp = queue.poll();
                if (temp != null) {
                    curr.add(temp.data);
                    if (temp.left != null)
                        queue.offer(temp.left);
                    if (temp.right != null)
                        queue.offer(temp.right);
                } else {
                    if (leftToRight) {
                        zigZagList.addAll(curr);
                        curr.clear();

                    } else {
                        Stack<Integer> stack = new Stack<>();
                        stack.addAll(curr);
                        while (!stack.isEmpty()) {
                            Integer v = stack.pop();
                            zigZagList.add(v);
                        }
                        curr.clear();
                    }

                    if (!queue.isEmpty()) {
                        queue.offer(null);
                        leftToRight = !leftToRight;
                    }
                }
            }
        } else {
            System.out.println("There is no data in the tree");
        }

        for(int i : zigZagList)
            System.out.println(i);
    }

    //verticle SumOfTree
    public static void vSum(HashMap<Integer,Integer> hash,BinaryTreeNode root,int c)
    {
        if (root.left!=null)
            vSum(hash,root.left,c-1);
        if (root.right!=null)
            vSum(hash,root.right,c+1);

        int data = 0;
        if (hash.containsKey(c))
            data = hash.get(c);
        hash.put(c,root.data+data);
    }


}
