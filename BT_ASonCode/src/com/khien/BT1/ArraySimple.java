package com.khien.BT1;

public class ArraySimple<E> {
    private static int size = 0;
    private final int CAPACITY = 10;
    public Object[] ints;
    private Function function = new Function();

    ArraySimple() {
        ints = new Object[CAPACITY];
    }

    ArraySimple(int capacity) {
        if (capacity < 0) {
            throw new IndexOutOfBoundsException("Capacity not found");
        }
        ints = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Not found");
        }
        for (int i = index; i <= size; i++) {
            E temp = element;
            element = (E) ints[i];
            ints[i] = temp;
        }
        size++;
    }

    public void add(E element) {
        ints[size++] = element;
    }

    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Not found");
        }

        E removeItem = (E) ints[index];
        for (int i = index; i <= size; i++) {
            ints[i] = ints[i + 1];
        }
        ints[size] = null;
        size--;
    }

    public static int getSize() {
        return size;
    }

}
