package com.nirmal.trees;

public class Tree {
    private Node root;

    public Tree(){
        this.root=null;
    }

    public Node search(int data){
        Node current = root;
        System.out.println("Visiting elements: ");
        while (current.data != data){
            if(current != null){
                System.out.println(current.data+" ");

                if(current.data > data){
                    current = current.left;
                }else{
                    current = current.right;
                }
                if(current == null){
                    return null;
                }

            }
        }
        return current;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
            return;
        }
        Node current = root,parent=null;

        while(true){
            parent = current;

            if(data< parent.data){
                current = current.left;

                if(current == null){
                    parent.left = newNode;
                    return;
                }
            }else{
                current = current.right;

                if(current == null){
                    parent.right= newNode;
                    return;
                }
            }
        }
    }

    public void traverse(int traversalType){
        switch(traversalType){
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
    }
    private void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    private void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    private void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
