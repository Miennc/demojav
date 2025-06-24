package oop;

// Lớp trừu tượng (abstract class) dùng để mô tả các loài động vật, không thể tạo đối tượng trực tiếp từ lớp này
public abstract class Animal {
    // Phương thức trừu tượng (abstract method): các lớp con phải cài đặt lại phương thức này để định nghĩa tiếng kêu riêng
    public abstract void makeSound();

    // Phương thức thông thường: các lớp con có thể sử dụng lại hoặc ghi đè nếu muốn thay đổi hành vi ăn
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
