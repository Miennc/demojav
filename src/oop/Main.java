package oop;

public class Main {
    public static void main(String[] args) {
        // Ví dụ về tính đóng gói: tạo đối tượng Person và truy cập thông tin qua getter
        Person p = new Person("Nam", 20);
        System.out.println("Tên: " + p.getName());
        System.out.println("Tuổi: " + p.getAge());
        // Ví dụ về tính kế thừa: Student kế thừa Person và có thêm thuộc tính studentId
        Student s = new Student("Lan", 19, "SV001");
        System.out.println("Tên SV: " + s.getName());
        System.out.println("Tuổi SV: " + s.getAge());
        System.out.println("Mã SV: " + s.getStudentId());
        // Ví dụ về đa hình: cùng gọi introduce nhưng kết quả khác nhau tùy đối tượng
        Person p1 = new Person("Hùng", 30);
        Person p2 = new Student("Mai", 21, "SV002");
        p1.introduce(); // Gọi introduce của Person
        p2.introduce(); // Gọi introduce của Student (đa hình)
        // Ví dụ về tính trừu tượng: Animal là lớp trừu tượng, Dog kế thừa và cài đặt makeSound
        Animal a = new Dog();
        a.makeSound(); // Gọi phương thức trừu tượng đã được cài đặt ở Dog
        a.eat(); // Gọi phương thức thông thường của Animal
    }
}
