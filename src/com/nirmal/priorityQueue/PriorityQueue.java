package com.nirmal.priorityQueue;

    public class PriorityQueue {
        private final int MAX;
        private int[] array;
        private int size;
        public PriorityQueue(int size){
            MAX = size;
            array = new int[MAX];
            this.size = 0;
        }
        public void insert(int data){
            int i =0;
            if(!isFull()){
                // if queue is empty, insert the data
                if(size == 0){
                    array[size++] = data;
                }
                else
                {
                    // start from the right end of the queue
                    for(i = size - 1; i >= 0; i-- ){
                        // if data is larger, shift existing item to right end
                        if(data > array[i]){
                            array[i+1] = array[i];
                        }else{
                            break;
                        }
                    }
                    // insert the data
                    array[i+1] = data;
                    size++;
                }
            }
        }
        public int remove(){
            return array[--size];
        }
        public int peek(){
            return array[size - 1];

        }
        public boolean isEmpty(){
            return size == 0;
        }
        public boolean isFull(){
            return size == MAX;
        }
        public int size(){
            return size;
        }
    }

