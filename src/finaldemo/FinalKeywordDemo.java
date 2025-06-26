// finaldemo/FinalKeywordDemo.java
// Lý thuyết về từ khóa 'final' trong Java và ví dụ demo

/*
Từ khóa 'final' trong Java được sử dụng để khai báo rằng một biến, phương thức hoặc lớp không thể bị thay đổi hoặc ghi đè.
- final với biến: Giá trị không thể thay đổi sau khi gán lần đầu tiên.
- final với phương thức: Phương thức không thể bị override ở lớp con.
- final với class: Lớp không thể bị kế thừa.
*/

package finaldemo;

// final với class
final class FinalClass {
    public void show() {
        System.out.println("Đây là lớp final, không thể kế thừa!");
    }
}

// final với phương thức
class Parent {
    public final void display() {
        System.out.println("Phương thức final, không thể override!");
    }
}

class Child extends Parent {
    // Không thể override phương thức display()
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // final với biến
        final int x = 10;
        System.out.println("Giá trị của biến final x: " + x);
        // x = 20; // Lỗi: không thể gán lại giá trị cho biến final

        FinalClass fc = new FinalClass();
        fc.show();

        Child c = new Child();
        c.display();
    }
}
