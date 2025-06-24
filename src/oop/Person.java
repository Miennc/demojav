package oop;

// Lớp Person minh họa tính đóng gói (encapsulation) và là lớp cha cho Student (đa hình)
public class Person {
    // Thuộc tính private: chỉ truy cập được qua getter/setter để bảo vệ dữ liệu
    private String name;
    private int age;

    // Constructor: khởi tạo đối tượng Person với tên và tuổi
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter: trả về giá trị thuộc tính name
    public String getName() {
        return name;
    }

    // Setter: thay đổi giá trị thuộc tính name
    public void setName(String name) {
        this.name = name;
    }

    // Getter: trả về giá trị thuộc tính age
    public int getAge() {
        return age;
    }

    // Setter: thay đổi giá trị thuộc tính age
    public void setAge(int age) {
        this.age = age;
    }

    // Phương thức giới thiệu: sẽ được ghi đè ở lớp con để minh họa đa hình
    public void introduce() {
        System.out.println("Tôi là " + name + ", " + age + " tuổi.");
    }
}
