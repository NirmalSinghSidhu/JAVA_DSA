package com.nirmal.trees;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
       this.data=data;
    }
    public void display(){
        System.out.print("("+data+ ")");
    }
}
