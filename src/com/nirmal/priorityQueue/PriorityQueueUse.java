package com.nirmal.priorityQueue;

public class PriorityQueueUse {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(6);

        //insert 5 items
        queue.insert(3);
        queue.insert(5);
        queue.insert(9);
        queue.insert(1);
        queue.insert(12);
        // ------------------
        // index : 0 1 2 3 4
        // ------------------
        // queue : 12 9 5 3 1
        queue.insert(15);
        // ---------------------
        // index : 0 1 2 3 4 5
        // ---------------------
        // queue : 15 12 9 5 3 1
        if(queue.isFull()){
            System.out.println("Queue is full!");
        }
        //remove one item
        int num = queue.remove();
        System.out.println("Element removed: "+num);
        // ---------------------
        // index : 0 1 2 3 4
        // ---------------------
        // queue : 15 12 9 5 3
        //insert more items
        queue.insert(16);
        // ----------------------
        // index : 0 1 2 3 4 5
        // ----------------------
        // queue : 16 15 12 9 5 3
        //As queue is full, elements will not be inserted.
        queue.insert(17);
        queue.insert(18);
        // ----------------------
        // index : 0 1 2 3 4 5
        // ----------------------
        // queue : 16 15 12 9 5 3
        System.out.println("Element at front: "+queue.peek());
        System.out.println("----------------------");
        System.out.println("index : 5 4 3 2 1 0");
        System.out.println("----------------------");
        System.out.print("Queue: ");
        while(!queue.isEmpty()){
            int n = queue.remove();
            System.out.print(n +" ");
        }
    }
}
