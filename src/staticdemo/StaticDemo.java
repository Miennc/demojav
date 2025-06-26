package staticdemo;

// Demo về từ khóa static trong Java
//
// Định nghĩa:
// Từ khóa static dùng để khai báo các thành phần (biến, phương thức, khối lệnh, lớp lồng nhau)
// mà thuộc về lớp (class) chứ không phải đối tượng (instance).
// - Biến static: dùng chung cho tất cả đối tượng, truy cập qua tên lớp.
// - Phương thức static: gọi trực tiếp qua tên lớp, không cần tạo đối tượng.
// - Không thể truy cập biến/ phương thức instance từ bên trong static.
// - nếu muốn biến không thay đổi, có thể dùng từ khóa final để khai báo biến static.
//
// Mục đích:
// - Quản lý tài nguyên dùng chung cho tất cả đối tượng (ví dụ: đếm số lượng đối tượng, cấu hình chung).
// - Tiết kiệm bộ nhớ vì chỉ tạo một lần duy nhất cho cả lớp.
// - Tạo các hàm tiện ích (utility) mà không cần tạo đối tượng.
//
// Ví dụ:
// StaticDemo.staticCount hoặc StaticDemo.showStaticCount();
// Không cần tạo đối tượng StaticDemo.
public class StaticDemo {
    // Biến static (biến lớp)
    static int staticCount = 0;
    // Biến instance (biến đối tượng)
    int instanceCount = 0;

    // Phương thức static
    static void showStaticCount() {
        System.out.println("staticCount = " + staticCount);
        // Không thể truy cập instanceCount ở đây
    }

    // Phương thức instance
    void showInstanceCount() {
        System.out.println("instanceCount = " + instanceCount);
    }

    // Constructor
    public StaticDemo() {
        staticCount++;
        instanceCount++;
    }
}
