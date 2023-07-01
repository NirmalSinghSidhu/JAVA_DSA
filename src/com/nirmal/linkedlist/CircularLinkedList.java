package com.nirmal.linkedlist;

public class CircularLinkedList<T> {
    private NodeD<T> head;
    private NodeD<T> tail;

    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void display(){
        NodeD<T> current = head;

        //navigate till the end of the list
        System.out.print("[");
        while(current.next != head){
            //print data
            System.out.print(current.data +" ");
            //move to next item
            current = current.next;
        }
        System.out.print(current.data+ "]");
        System.out.println("");
    }

    public void displayInReverse(){
        NodeD<T> current = tail;

        //navigate till the head of the list
        System.out.print("[");
        while(current.prev != tail){
            //print data
            System.out.print(current.data +" ");
            //move to next item
            current = current.prev;
        }
        System.out.print(current.data+"]");
        System.out.println("");

    }

    public void insertAtFirst(T data){
        NodeD<T> newNode = new NodeD<>(data);
        if(head== null){
            head =newNode;
            tail=newNode;
            newNode.next=newNode;
            newNode.prev=newNode;
            return;
        }
        newNode.next=head;
        newNode.prev=tail;
        tail.next=newNode;
        head.prev=newNode;
        head=newNode;
    }

    public void insertAtLast(T data){
        NodeD<T> newNode = new NodeD<>(data);
        if(head== null){
            head =newNode;
            tail=newNode;
            newNode.next=newNode;
            newNode.prev=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        newNode.next=head;
        head.prev=newNode;
        tail=newNode;
    }

    public void deleteAtFirst(){
        if(head == null || head.next==tail){
            head=null;
            tail=null;
            return;
        }
        tail.next=head.next;
        head.next.prev=tail;
        head= head.next;
    }

    public void deleteAtEnd(){
        if(head == null || head.next==tail){
            head=null;
            tail=null;
            return;
        }
        head.prev=tail.prev;
        tail.prev.next=head;
        tail=tail.prev;
    }

    public void delete(int data){
        if(head == null){
            return;
        }
        if(head.data.equals(data)){
            deleteAtFirst();
            return;
        }
        if(tail.data.equals(data)){
            deleteAtEnd();
            return;
        }
        NodeD<T> current = head;
        NodeD<T> current2 = tail;

        while(current != current2) {
            if(current.data.equals(data)){
                break;
            }
            if(current2.data.equals(data)){
                break;
            }
            current= current.next;
            current2= current2.prev;
        }

        if(current== current2 && !current.data.equals(data)){
            System.out.println("Cant delete!! Node with the data("+data+")is not present in the linked list");
            return;
        }

        if(current.data.equals(data)){
            current.prev.next=current.next;
            current.next.prev=current.prev;
        }

        if(current2.data.equals(data)){
            current2.prev.next=current2.next;
            current2.next.prev=current2.prev;
        }
    }

    public int length(){
        int count =0 ;
        NodeD<T> current = head;
        while(current.next!=head){
            current=current.next;
            count++;
        }
        return count+1;
    }

    public boolean isEmpty(){
        return head==null;
    }
}
