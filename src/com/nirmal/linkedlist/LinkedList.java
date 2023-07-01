package com.nirmal.linkedlist;

public class LinkedList<T> {

    //head points to the first node of the linkedList
    private Node head;

    //creating empty LinkedList
    public LinkedList(){
        head = null;
    }


    //displaying the linked list
    public void display(){
        Node<T> current = head;

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

    //inserting at the first location
    public Node<T> insertAtFirst(T data){
      Node<T> newNode = new Node(data);
      newNode.next= head;
      head = newNode;
      return head;
    }

    //inserting at the last
    public Node<T> insertAtLast(T data){
        Node<T> newNode = new Node(data);
        if(head==null){
            head = newNode;
            return head;
        }
        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    //delete at the beginning and return the deleted Node
    public Node<T> deleteAtFirst(){
        if(head == null){
            return null;
        }

        Node<T> temp = head;
        head = head.next;
        return temp;
    }

    //delete at the end of the linkedList

    public Node<T> deleteAtLast(){
        if(head == null || head.next == null){
            return null;
        }
        Node<T> current = head;
        while(current.next.next != null){
            current= current.next;
        }
        current.next=null;
        return head;
    }

    //delete the node with a given data value
    public Node<T> delete(int data){
        Node<T> current = head;
        Node<T> previous = null;

        if(head == null){
            return null;
        }

        //iterate through the linked List
        while(current != null && !current.data.equals(data)){
            previous=current;
            current= current.next;
        }
        if(current==null){
            return null;
        }
        if(previous == null){
            head=head.next;
            return head;
        }else{
            previous.next=current.next;
        }
        return current;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public  int length(){
        int count =0;
        Node<T> current = head;
        while(current!=null){
            current= current.next;
            count++;
        }
        return count;
    }

    public void sort(){
        //bubbleSort
        int size = length();
        int tempData;
        Node<Integer> current ,nextNode;
        int k= size;
        for(int i =0;i<size-1;i++){
            current = head;
            nextNode = head.next;

            for(int j = 1;j<k;j++){
               if(current.data >nextNode.data){
                   tempData = current.data;
                   current.data = nextNode.data;
                   nextNode.data=tempData;
               }
               current=current.next;
               nextNode = nextNode.next;
            }
        }
    }

    public int  search(int data){
        Node<T> temp = head;
        int count = 0;
        while(temp!=null){
            if(temp.data.equals(data)){
                return count;
            }
            count++;
        }
        return -1;
    }

    public Node<T> reverse(){
        if(head==null || head.next == null){
            return null;
        }
        Node<T> current,prev,nextNode;
        current = head;
        prev = null;
        nextNode = head.next;
        while(current.next != null){
            current.next=prev;
            prev=current;
            current =nextNode;
            nextNode=nextNode.next;
        }
        current.next=prev;
        head= current;
        return current;
    }

    public void concatenate(LinkedList<T> linkedList){
        if(head==null){
            head=linkedList.head;
        }
        if(linkedList.head==null){
            return;
        }
        Node<T> temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=linkedList.head;
    }
}
