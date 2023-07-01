package com.nirmal.trees;

public class TreeUse {
    public static void main(String[] args) {
        Tree tree = new Tree();
        /* 11 //Level 0
         */
        tree.insert(11);
        /* 11 //Level 0
         * |
         * |---20 //Level 1
         */
        tree.insert(20);
        /* 11 //Level 0
         * |
         * 3---|---20 //Level 1
         */
        tree.insert(3);
        /* 11 //Level 0
         * |
         * 3---|---20 //Level 1
         * |
         * |--42 //Level 2
         */
        tree.insert(42);
        /* 11 //Level 0
         * |
         * 3---|---20 //Level 1
         * |
         * |--42 //Level 2
         * |
         * |--54 //Level 3
         */
        tree.insert(54);
        /* 11 //Level 0
         * |
         * 3---|---20 //Level 1
         * |
         * 16--|--42 //Level 2
         * |
         * |--54 //Level 3
         */
        tree.insert(16);
        /* 11 //Level 0
         * |
         * 3---|---20 //Level 1
         * |
         * 16--|--42 //Level 2
         * |
         * 32--|--54 //Level 3
         */
        tree.insert(32);
        /* 11 //Level 0
         * |
         * 3---|---20 //Level 1
         * | |
         * |--9 16--|--42 //Level 2
         * |
         * 32--|--54 //Level 3
         */
        tree.insert(9);
        /* 11 //Level 0
         * |
         * 3---|---20 //Level 1
         * | |
         * |--9 16--|--42 //Level 2
         * | |
         * 4--| 32--|--54 //Level 3
         */
        tree.insert(4);
        /* 11 //Level 0
         * |
         * 3---|---20 //Level 1
         * | |
         * |--9 16--|--42 //Level 2
         * | |
         * 4--|--10 32--|--54 //Level 3
         */
        tree.insert(10);
        Node node = tree.search(32);
        if(node!=null){
            System.out.print("Element found.");
            node.display();
            System.out.println();
        }else{
            System.out.println("Element not found.");
        }
        Node node1 = tree.search(2);
        if(node1!=null){
            System.out.println("Element found.");
            node1.display();
            System.out.println();
        }else{
            System.out.println("Element not found.");
        }
        //pre-order traversal
        //root, left ,right
        tree.traverse(1);
        //in-order traversal
        //left, root ,right
        tree.traverse(2);
        //post order traversal
        //left, right, root
        tree.traverse(3);
    }
}
