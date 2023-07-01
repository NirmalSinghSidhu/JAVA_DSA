package com.nirmal.heap;

public class Heap {
    private int[] array;
    private int size;

    public Heap(int size){
        array = new int[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getMinimum(){
        return array[0];
    }

    public int getLeftChildIndex(int nodeIndex){
        return 2*nodeIndex +1;
    }
    public int getRightChildIndex(int nodeIndex){
        return 2*nodeIndex +2;
    }
    public int getParentIndex(int nodeIndex){
        return (nodeIndex -1)/2;
    }
    public boolean isFull(){
        return size == array.length;
    }
    public void insert(int value) {
        size++;
        array[size - 1] = value;
        heapUp(size - 1);
    }
    public void removeMin() {
        array[0] = array[size - 1];
        size--;
        if (size > 0)
            heapDown(0);
    }
    /**
     * Heap up the new element,until heap property is broken.
     * Steps:
     * 1. Compare node's value with parent's value.
     * 2. Swap them, If they are in wrong order.
     * */
    private void heapUp(int nodeIndex){
        int parentIndex, tmp;
        if (nodeIndex != 0) {
            parentIndex = getParentIndex(nodeIndex);
            if (array[parentIndex] > array[nodeIndex]) {
                tmp = array[parentIndex];
                array[parentIndex] = array[nodeIndex];
                array[nodeIndex] = tmp;
                heapUp(parentIndex);
            }
        }
    }
    /**
     * Heap down the root element being least in value,until heap property is broken.
     * Steps:
     * 1.If current node has no children, done.
     * 2.If current node has one children and heap property is broken,
     * 3.Swap the current node and child node and heap down.
     * 4.If current node has one children and heap property is broken, find smaller one
     * 5.Swap the current node and child node and heap down.
     * */
    private void heapDown(int nodeIndex){
        int leftChildIndex, rightChildIndex, minIndex, tmp;
        leftChildIndex = getLeftChildIndex(nodeIndex);
        rightChildIndex = getRightChildIndex(nodeIndex);
        if (rightChildIndex >= size) {
            if (leftChildIndex >= size)
                return;
            else
                minIndex = leftChildIndex;
        } else {
            if (array[leftChildIndex] <= array[rightChildIndex])
                minIndex = leftChildIndex;
            else
                minIndex = rightChildIndex;
        }
        if (array[nodeIndex] > array[minIndex]) {
            tmp = array[minIndex];
            array[minIndex] = array[nodeIndex];
            array[nodeIndex] = tmp;
            heapDown(minIndex);
        }
    }

}
