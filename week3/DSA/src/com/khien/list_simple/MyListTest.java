package com.khien.list_simple;

import com.khien.list_simple.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.addElement(1);
        listInteger.addElement(2);
        listInteger.addElement(3);
        listInteger.addElement(4);

        System.out.println("Element 4: "+ listInteger.getElementAtPositionIndex(4));
        System.out.println("Element 2: "+ listInteger.getElementAtPositionIndex(2));
        System.out.println("Element 1: "+ listInteger.getElementAtPositionIndex(1));

//        listInteger.getElementAtPositionIndex(6);
//        System.out.println("Element 6: "+ listInteger.getElementAtPositionIndex(6));
        listInteger.getElementAtPositionIndex(-1);
        System.out.println("Element -1: "+ listInteger.getElementAtPositionIndex(-1));
    }
}
