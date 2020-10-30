package com.khien.BT1;

import java.util.InputMismatchException;
import java.util.ArrayList;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] element;

    MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        //tạo một danh sách trống với dung lượng  bn dầu được chỉ định
        if (capacity < 0) {
            throw new IllegalArgumentException("Kích thước mảng phải là số nguyên dương");
        } else element = new Object[capacity];
    }

    public void add(int index, E e) {
        // chèn phần tử được chỉ định vào vị trí được chỉ định
        if (index >= size) {
            throw new IndexOutOfBoundsException("vị trí " + index + " vượt quá mảng");
        }

        for (int i = index; i <= size; i++) {
            E temp = e;
            e = (E) element[i];
            element[i] = temp;

        }
        size++;
    }

    public void clear() {
        //xóa hết phần tử khỏi danh sách.

    }

    public E remove(int index) {//xóa phần tử trong mảng tại vị trí index
        if (index >= size) {
            throw new IndexOutOfBoundsException("vị trí " + index + " vượt quá mảng");
        }
        E removeValue = (E) element[index];
        for (int i = index; i <= size; i++) {
            element[i] = element[i + 1];
        }
        element[size] = null;
        size--;
        return removeValue;

    }

    public E get(int index) {
        // trả về giá trị phần tử tại vị trí index
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Toang");
        }

        return (E) element[index];
    }

    public int getSize() {
        // trả về số phần tử trong mảng
        return size;
    }

    public boolean add(E o) {
        element[size++] = o;
        return true;
    }
}
