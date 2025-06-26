package exceptionhandling;

/**
 * Exception Handling trong Java
 *
 * 1. Mục đích sử dụng:
 *    - Xử lý các lỗi phát sinh trong quá trình thực thi chương trình mà không làm chương trình bị dừng đột ngột.
 *    - Giúp kiểm soát luồng thực thi khi có lỗi xảy ra.
 *    - Cung cấp thông tin về lỗi cho người dùng hoặc lập trình viên.
 *    - Tăng tính ổn định và an toàn cho chương trình.
 *
 * 2. Lý thuyết:
 *    - Ngoại lệ (Exception) là các sự kiện bất thường xảy ra trong quá trình thực thi chương trình.
 *    - Java cung cấp cơ chế xử lý ngoại lệ thông qua các khối try-catch-finally.
 *    - Có hai loại ngoại lệ chính: Checked Exception (phải xử lý) và Unchecked Exception (Runtime Exception).
 *
 * 3. Cú pháp cơ bản:
 *    try {
 *        // Mã có thể phát sinh ngoại lệ
 *    } catch (ExceptionType e) {
 *        // Xử lý ngoại lệ
 *    } finally {
 *        // Luôn được thực thi (không bắt buộc)
 *    }
 */
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // Cố tình truy cập phần tử ngoài phạm vi để gây ra ngoại lệ
            System.out.println("Phần tử thứ 4: " + numbers[10]); // Lỗi: chỉ có 3 phần tử
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Đã xảy ra ngoại lệ: " + e.getMessage());
        } finally {
            System.out.println("Khối finally luôn được thực thi!");
        }

        System.out.println("Chương trình tiếp tục chạy bình thường.");
    }
}
