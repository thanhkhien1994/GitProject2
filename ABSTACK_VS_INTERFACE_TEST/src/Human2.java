public class Human2 implements InterfaceTest {

    @Override
    public void run() {
        System.out.println("Chạy ỉa");
    }

    @Override
    public void noise() {
        System.out.println("Chào cậu");
    }

    @Override
    public void go() {
        System.out.println("Di chuyển ngay!");
    }

    public void test(){
        System.out.println(NAME);
        System.out.println(AGE);
    }
}
