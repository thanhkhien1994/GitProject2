package com.khien.list_simple;

import java.util.Arrays;
import java.util.InputMismatchException;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public void nhan2SizeMang() {
        int newSize = element.length * 2;

        element = Arrays.copyOf(element, newSize);
    }

    public void addElement(E e) {
        if (size == element.length) {
            nhan2SizeMang();
        }

        element[size++] = e;
    }

    public E getElementAtPositionIndex(int index) {
        if (index >= size || index < 0) {
            throw new InputMismatchException("vị trí: "+ index +", độ dài " +index);
            // Hiển thị lỗi exception như alert trong java script
        }
        return (E) element[index];
    }
}
