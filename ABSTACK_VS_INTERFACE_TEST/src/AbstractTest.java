public abstract class AbstractTest {
    //Thuộc tính;
    private String name;
    private int age;
    //Hàm khởi tạo
    public AbstractTest(String name, int age){
        this.name = name;
        this.age = age;
    }

    public AbstractTest(){};
    //phương thức
    public void run(){
        System.out.println("Chạy ngay đi");
    }
    public void noise(){
        System.out.println("Chào cậu");
    }

    public abstract void go();
}
