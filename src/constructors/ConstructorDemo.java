package constructors;

public class ConstructorDemo {
    String message;
    int number;

    // Constructor không tham số
    public ConstructorDemo() {
        message = "Hello, đây là constructor không tham số!";
        number = 0;
    }

    // Constructor có tham số
    public ConstructorDemo(String msg, int num) {
        message = msg;
        number = num;
    }

    public void showInfo() {
        System.out.println("Message: " + message);
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        ConstructorDemo demo1 = new ConstructorDemo();
        demo1.showInfo();

        ConstructorDemo demo2 = new ConstructorDemo("Xin chào Java!", 2025);
        demo2.showInfo();
    }
}
