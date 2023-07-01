package com.nirmal.linkedlist;

public class DoublyLinkedList<T> {
    private NodeD<T> head;
    private NodeD<T> tail;

    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void display(){
        NodeD<T> current = head;

        //navigate till the end of the list
        System.out.print("[");
        while(current != null){
            //print data
            System.out.print(current.data +" ");
            //move to next item
            current = current.next;
        }
        System.out.print("]");
        System.out.println("");
    }

    public void displayInReverse(){
        NodeD<T> current = tail;

        //navigate till the head of the list
        System.out.print("[");
        while(current != null){
            //print data
            System.out.print(current.data +" ");
            //move to next item
            current = current.prev;
        }
        System.out.print("]");
        System.out.println("");

    }

    public void insertAtFirst(T data){
        NodeD<T> newNode = new NodeD<>(data);
        if(head == null){
            head = newNode;
            tail= newNode;
            return;
        }
        head.prev=newNode;
        newNode.next=head;
        head = newNode;
    }

    public void insertAtLast(T data){
        NodeD<T> newNode = new NodeD<>(data);
        if(head == null){
            head = newNode;
            tail= newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public void deleteAtFirst(){
        if(head==null || head.next==null){
            head = null;
            tail= null;
            return;
        }
        head.next.prev=null;
        head = head.next;
    }

    public void deleteAtLast(){
        if(head==null || head.next==null){
            head = null;
            tail= null;
            return;
        }
        tail.prev.next=null;
        tail = tail.prev;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int length(){
        int count =0 ;
        NodeD<T> current = head;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
    }
    // insert the newData node after the data node in the present linked list if the data node is not present then do not insert the node
    public void insertAfter(T data,T newData){
        if(head == null){
            return;
        }
        NodeD<T> current = head;
        NodeD<T> current2 = tail;

        if(tail.data.equals(data)){
            insertAtLast(newData);
            return;
        }

        while(current != current2){
            if(current.data.equals(data)){
                break;
            }
            if(current2.data.equals(data)){
                break;
            }
            current= current.next;
            current2= current2.prev;
        }
        if(current == current2 && !current.data.equals(data)){
            return;
        }
        NodeD<T> newNode = new NodeD<>(newData);
        if(current.data.equals(data)){
            //insert
            newNode.next=current.next;
            current.next.prev=newNode;
            newNode.prev=current;
            current.next=newNode;
        }

        if(current2.data.equals(data)){
            //insert
            newNode.next=current2.next;
            current2.next.prev=newNode;
            newNode.prev=current2;
            current2.next=newNode;
        }
    }
    // // insert the newData node before the data node in the present linked list if the data node is not present then do not insert the node
    public void insertBefore(T data,T newData){
        if(head == null){
            return;
        }
        if(head.data.equals(data)){
            insertAtFirst(newData);
            return;
        }
        NodeD<T> current = head;
        NodeD<T> current2 = tail;

        while(current != current2){
            if(current.data.equals(data)){
                break;
            }
            if(current2.data.equals(data)){
                break;
            }
            current= current.next;
            current2= current2.prev;
        }

        if(current == current2 && !current.data.equals(data)){
            System.out.println("Cant inset !! Node with the data("+data+")is not present in the linked list");
            return;
        }

        NodeD<T> newNode = new NodeD<>(newData);
        if(current.data.equals(data)){
            newNode.next=current;
            current.prev.next=newNode;
            newNode.prev=current.prev;
            current.prev=newNode;
        }

        if(current2.data.equals(data)){
            newNode.next=current2;
            current2.prev.next=newNode;
            newNode.prev=current2.prev;
            current2.prev=newNode;
        }
    }
    //delete the node with the specific data
    public void delete(int data){
        if(head == null){
            return;
        }
        if(head.data.equals(data)){
            deleteAtFirst();
            return;
        }
        if(tail.data.equals(data)){
            deleteAtLast();
            return;
        }
        int size = length();
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
}

