package com.nirmal.queues;

public class QueueUse {
    public static void main(String[] args) {
        Queue queue = new Queue(6);

        //insert 5 items
        queue.insert(3);
        queue.insert(5);
        queue.insert(9);
        queue.insert(1);
        queue.insert(12);
        // front : 0
        // rear : 4
        // ------------------
        // index : 0 1 2 3 4
        // ------------------
        // queue : 3 5 9 1 12
        queue.insert(15);
        // front : 0
        // rear : 5
        // ---------------------
        // index : 0 1 2 3 4 5
        // ---------------------
        // queue : 3 5 9 1 12 15
        if(queue.isFull()){
            System.out.println("Queue is full!");
        }
        //remove one item
        int num = queue.remove();
        System.out.println("Element removed: "+num);
        // front : 1
        // rear : 5
        // -------------------
        // index : 1 2 3 4 5
        // -------------------
        // queue : 5 9 1 12 15
        //insert more items
        queue.insert(16);
        // front : 1
        // rear : -1
        // ----------------------
        // index : 0 1 2 3 4 5
        // ----------------------
        // queue : 16 5 9 1 12 15
        //As queue is full, elements will not be inserted.
        queue.insert(17);
        queue.insert(18);
        // ----------------------
        // index : 0 1 2 3 4 5
        // ----------------------
        // queue : 16 5 9 1 12 15
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
