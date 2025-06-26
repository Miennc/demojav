package staticdemo;

public class Main {
    public static void main(String[] args) {
        // Tạo 3 đối tượng StaticDemo
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        // Gọi phương thức static (qua class)
        StaticDemo.showStaticCount(); // staticCount = 3

        // Gọi phương thức instance (qua đối tượng)
        obj1.showInstanceCount(); // instanceCount = 1
        obj2.showInstanceCount(); // instanceCount = 1
        obj3.showInstanceCount(); // instanceCount = 1

        // Thay đổi biến static
        StaticDemo.staticCount = 10;
        StaticDemo.showStaticCount(); // staticCount = 10
    }
}
