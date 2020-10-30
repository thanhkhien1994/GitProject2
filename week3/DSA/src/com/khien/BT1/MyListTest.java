package com.khien.BT1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        MyList<Integer> _int = new MyList<Integer>();
        _int.add(123456789);
        System.out.println(_int.get(0));

        // thêm phần tử vào mảng
        myList.add("Một");
        myList.add("Hai");
        myList.add("Ba");
        myList.add("Bốn");
        myList.add("Năm");

        System.out.println("số phần tử trong mảng: "+myList.size + ", độ dài mảng  "+myList.DEFAULT_CAPACITY);
        for (int i = 0; i < myList.size; i++) {
            System.out.println("Thành phần tại chỉ số "+i+": "+myList.get(i));
        }

        // thêm phần tử tại vị trí chỉ định
        int addIndex = 1;
        String addItem = "CodeGym";
        myList.add(addIndex, addItem);
        System.out.println("--------------\nThêm phần tử tại vị trí "+ addIndex + ": "+addItem);
        System.out.println("số phần tử trong mảng: "+myList.size + ", độ dài mảng  "+myList.DEFAULT_CAPACITY);
        for (int i = 0; i < myList.size; i++) {
            System.out.println("Thành phần tại chỉ số "+i+": "+myList.get(i));
        }
        System.out.println("\n----------------------------");
        // xóa phần tử tại vị trí chỉ định;
        int removeIndex = 2;
        String removeItem = myList.remove(removeIndex);
        String removeItem2 = myList.remove(3);

        for (int i = 0; i < myList.size; i++) {
            System.out.println("Thành phần tại chỉ số "+i+": "+myList.get(i));
        }
    }
}
