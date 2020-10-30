import java.util.AbstractQueue;

public class Main {
    public static void main(String[] args) {
        AbstractTest abstractTest   = new AbstractTest() {
            @Override
            public void go() {
                System.out.println("Khiên");
            }

        };

        InterfaceTest interfaceTest = new InterfaceTest() {
            @Override
            public void run() {

            }

            @Override
            public void noise() {

            }

            @Override
            public void go() {

            }
        };
        System.out.println("Humnan1");//abstract
        Human1 human1 = new Human1();
        human1.go();
        human1.run();
        human1.noise();
        System.out.println("Human2");//interface
        Human2 human2 = new Human2();
        human2.go();
        human2.run();
        human2.noise();
        human2.test();
    }
}
