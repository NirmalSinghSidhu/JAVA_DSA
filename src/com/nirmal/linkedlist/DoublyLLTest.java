package com.nirmal.linkedlist;

public class DoublyLLTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        int array[] = {1,8,6,5,7,3};
        for(int elem: array){
            list.insertAtFirst(elem);
        }

        int array2[]= {10,20,30,40,50};

        for(int elem: array2){
            list.insertAtLast(elem);
        }

        list.display();
        list.insertAfter(20,25);
        list.insertBefore(10,9);

        list.insertBefore(3,2);
        list.insertBefore(50,49);

        list.insertAfter(2,22);
        list.insertAfter(50,51);
        list.delete(6);
        list.display();
        list.displayInReverse();
    }
}
