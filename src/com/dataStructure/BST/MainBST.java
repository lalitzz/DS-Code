package com.dataStructure.BST;

public class MainBST {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
        tree.insert(4);
        tree.insert(17);
        tree.preOrder();
        tree.delete(10);
        System.out.println("*****************");
        tree.preOrder();
    }
}