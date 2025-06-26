// innerclasses/InnerClassDemo.java
// Lý thuyết về các loại lớp nội (Inner Classes) trong Java và ví dụ demo

/*
Lớp nội (Inner Class) trong Java là lớp được khai báo bên trong một lớp khác. Có 4 loại chính:
1. Inner Class (lớp nội thông thường)
2. Static Nested Class (lớp lồng nhau tĩnh)
3. Local Inner Class (lớp nội cục bộ trong phương thức)
4. Anonymous Inner Class (lớp nội vô danh)
*/

/*
Mục đích sử dụng các lớp nội (Inner Classes) trong Java:
- Tăng tính đóng gói (encapsulation): Giúp che giấu các lớp chỉ dùng nội bộ bên trong lớp chứa nó.
- Tổ chức mã nguồn hợp lý hơn: Khi một lớp chỉ phục vụ cho một lớp khác, nên đặt nó làm inner class để dễ quản lý.
- Truy cập các thành phần của lớp ngoài: Inner class có thể truy cập các biến và phương thức của lớp ngoài, kể cả private.
- Hỗ trợ các tính năng đặc biệt như callback, event handling (thường dùng anonymous inner class).
*/

package innerclasses;

public class InnerClassDemo {
    // 1. Inner Class (lớp nội thông thường)
    class RegularInner {
        void show() {
            System.out.println("Đây là Regular Inner Class");
        }
    }

    // 2. Static Nested Class
    static class StaticNested {
        void show() {
            System.out.println("Đây là Static Nested Class");
        }
    }

    void methodWithLocalInner() {
        // 3. Local Inner Class
        class LocalInner {
            void show() {
                System.out.println("Đây là Local Inner Class");
            }
        }
        LocalInner li = new LocalInner();
        li.show();
    }

    public static void main(String[] args) {
        InnerClassDemo outer = new InnerClassDemo();
        // Sử dụng Regular Inner Class
        InnerClassDemo.RegularInner regular = outer.new RegularInner();
        regular.show();

        // Sử dụng Static Nested Class
        StaticNested staticNested = new StaticNested();
        staticNested.show();

        // Sử dụng Local Inner Class
        outer.methodWithLocalInner();

        // 4. Anonymous Inner Class
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Đây là Anonymous Inner Class");
            }
        };
        r.run();
    }
}
