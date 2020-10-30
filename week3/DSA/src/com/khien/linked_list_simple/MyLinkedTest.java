package com.khien.linked_list_simple;

public class MyLinkedTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(123);

        myLinkedList.addFist("Khiên");
        myLinkedList.addFist(2);
        myLinkedList.addFist(2.5);
        myLinkedList.addFist(0);

        myLinkedList.add(4,6);
        myLinkedList.add(4,9);

        myLinkedList.printList();

    }


}
