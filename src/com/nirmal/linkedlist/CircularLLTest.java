package com.nirmal.linkedlist;

public class CircularLLTest {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        int array[] = {1,8,6,5,7,3};
        for(int elem: array){
            list.insertAtFirst(elem);
        }

        int array2[]= {10,20,30,40,50};

        for(int elem: array2){
            list.insertAtLast(elem);
        }
        list.deleteAtEnd();
        list.deleteAtFirst();
        list.delete(10);
        list.delete(7);
        list.delete(40);
        list.display();
        list.displayInReverse();
        System.out.println(list.length());
    }
}
