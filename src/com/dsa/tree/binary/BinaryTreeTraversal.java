package com.dsa.tree.binary;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversal {

    public void preOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    public void postOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


    public void preOrderIterative(BinaryTreeNode root) {
        if (root == null)
            return;
        else {
            Stack<BinaryTreeNode> binaryTreeNodeStack = new Stack<>();
            binaryTreeNodeStack.push(root);

            while (!binaryTreeNodeStack.isEmpty()) {
                BinaryTreeNode binaryTreeNode = binaryTreeNodeStack.pop();
                System.out.print(binaryTreeNode.data + " ");
                if (binaryTreeNode.getRight() != null)
                    binaryTreeNodeStack.push(binaryTreeNode.getRight());
                if (binaryTreeNode.getLeft() != null)
                    binaryTreeNodeStack.push(binaryTreeNode.getLeft());
            }
        }
    }


    public void inOrderIterative(BinaryTreeNode root) {

        if (root == null) {
            return;
        } else {
            Stack<BinaryTreeNode> binaryTreeNodeStack = new Stack<>();
            BinaryTreeNode currentNode = root;
            boolean done = false;

            while (!done) {
                if (currentNode != null) {
                    binaryTreeNodeStack.push(currentNode);
                    currentNode = currentNode.left;
                } else {
                    if (!binaryTreeNodeStack.isEmpty()) {
                        currentNode = binaryTreeNodeStack.pop();
                        System.out.print(currentNode.data + " ");
                        currentNode = currentNode.right;
                    } else {
                        done = true;
                    }
                }
            }

        }
    }


    //using two stack
    public void postOrderIterative(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack1 = new Stack<>();
        Stack<BinaryTreeNode> stack2 = new Stack<>();

        if (root == null)
            return;
        else {
            stack1.push(root);
            while (!stack1.isEmpty()) {
                BinaryTreeNode temp = stack1.pop();
                stack2.push(temp);
                if (temp.left != null)
                    stack1.push(temp.left);
                if (temp.right != null)
                    stack1.push(temp.right);
            }
            while (!stack2.isEmpty()) {
                System.out.print(stack2.pop().data + " ");
            }
        }
    }

    //using one stack
    public void postOrderOneStack(BinaryTreeNode root) {
        BinaryTreeNode current = root;
        Stack<BinaryTreeNode> stack = new Stack<>();

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                BinaryTreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }


    public void levelOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();
        binaryTreeNodes.add(root);
        while (!binaryTreeNodes.isEmpty()) {
            BinaryTreeNode temp = binaryTreeNodes.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                binaryTreeNodes.add(temp.left);
            if (temp.right != null)
                binaryTreeNodes.add(temp.right);
        }
    }


}
