package com.nirmal.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.display();
        list.deleteAtLast();
        list.deleteAtFirst();
        list.insertAtFirst(34);
        list.insertAtLast(2);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(6);
        list.insertAtFirst(45);
        System.out.println("LinkedList before sorting");
        list.display();
        //sorting the linked list
        System.out.println("LinkedList after sorting");
        list.sort();
        list.display();
        System.out.println("LinkedList after reversing");
        list.reverse();
        list.display();

        int array[] = {1,2,3,4,5};
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int elem:array){
            list2.insertAtLast(elem);
        }
        System.out.println("Concatenating ");
        list.concatenate(list2);
        list.display();

        System.out.println("IsEmpty");
        System.out.println("Is the list is empty :"+list.isEmpty());

        System.out.println("Length of the linked list is :"+list.length());
    }
}
