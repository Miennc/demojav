package datatypes;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kiểu số nguyên (hay dùng nhất)
        int age = 20; // thường dùng
        byte b = 100;
        short s = 10000;
        long l = 100000L;

        // Kiểu số thực (hay dùng nhất là double)
        float height = 1.75f;
        double weight = 65.5; // thường dùng

        // Kiểu ký tự
        char grade = 'A';

        // Kiểu boolean (hay dùng)
        boolean isStudent = true; // thường dùng

        // Kiểu chuỗi (hay dùng nhất)
        String name = "Nguyen Van A"; // thường dùng

        System.out.println("int: " + age);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("long: " + l);
        System.out.println("float: " + height);
        System.out.println("double: " + weight);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isStudent);
        System.out.println("String: " + name);
    }
}
