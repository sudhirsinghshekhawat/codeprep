package com.dsa.heap;

import java.util.Arrays;

public class MaxIntHeap {

    private int capacity = 10;
    private int size = 0;

    private int[] items = new int[capacity];

    private int leftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int rightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int parentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return parentIndex(index) < size;
    }


    private int leftChild(int index) {
        return items[leftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[rightChildIndex(index)];
    }

    private int parent(int index) {
        return items[parentIndex(index)];
    }

    private void ensureCapacity() {
        if (size == capacity)
            items = Arrays.copyOf(items, capacity * 2);
        capacity = capacity * 2;
    }

    public int extractMax() {
        if (size == 0)
            throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    private void insert(int item) {
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parentIndex(index) < items[index]) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = leftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index))
                smallerChildIndex = rightChildIndex(index);

            if (items[index] > items[smallerChildIndex])
                break;
            else
                swap(index, smallerChildIndex);

            index = smallerChildIndex;
        }
    }

    private void swap(int index1, int index2) {

        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }
}
