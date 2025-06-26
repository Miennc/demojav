# Tổng hợp lý thuyết OOP (Java)

## 1. Đóng gói (Encapsulation)
- Che giấu dữ liệu bên trong đối tượng, chỉ cho phép truy cập qua các phương thức (getter/setter).
- Giúp bảo vệ dữ liệu, kiểm soát truy cập, dễ bảo trì.
- **Ví dụ:** Như crush của bạn, bạn chỉ được ngắm từ xa, không thể tiếp cận hay chạm vào, mọi thông tin đều phải qua "bộ lọc".

## 2. Kế thừa (Inheritance)
- Cho phép lớp con kế thừa thuộc tính và phương thức của lớp cha.
- Giúp tái sử dụng code, mở rộng chức năng dễ dàng.
- **Ví dụ :** Con chó là một loài động vật, nên nó thừa hưởng các đặc điểm chung của động vật như ăn, thở, di chuyển.

## 3. Đa hình (Polymorphism)
- Cho phép cùng một phương thức nhưng hành vi khác nhau tùy đối tượng thực tế.
- Giúp code linh hoạt, dễ mở rộng, xử lý nhiều loại đối tượng qua cùng một interface/class cha.
- **Ví dụ :** Khi bạn ra lệnh "chạy" thì con người, chó, và xe đều có thể "chạy" nhưng cách chạy của mỗi đối tượng lại khác nhau.

## 4. Trừu tượng (Abstraction)
- Che giấu chi tiết cài đặt, chỉ cung cấp những gì cần thiết qua abstract class hoặc interface.
- Giúp tập trung vào chức năng chính, giảm phức tạp khi sử dụng đối tượng.
- **Ví dụ :** Khi lái xe ô tô, bạn chỉ cần biết sử dụng vô lăng, chân ga, chân phanh mà không cần biết động cơ bên trong hoạt động thế nào.

> Ví dụ minh họa cụ thể đều có trong các file code của project này.




// note

Chuỗi (String) và xử lý chuỗi

Các chú thích và cách đặt tên trong Java

Cú pháp cơ bản của Java (Basic Syntax)

Các gói và giao diện (Packages and Interfaces)

Đa luồng (Multithreading)

Nhập xuất (Input/Output - I/O)

Bảo mật trong Java (Security)

1 Nâng cao Java Core: Tìm hiểu sâu hơn về Collections, Serialization, Threading, Stream & Lambda để xử lý dữ liệu hiệu quả hơn.

2 Cơ sở dữ liệu và JDBC: Học cách kết nối và thao tác với cơ sở dữ liệu bằng JDBC, hiểu các khái niệm về thiết kế cơ sở dữ liệu, SQL, và bộ nhớ cache.

3 ORM Framework: Tìm hiểu Hibernate hoặc JPA để làm việc với dữ liệu theo hướng đối tượng, giúp giảm thiểu code SQL thủ công.

4 Framework Java Backend: Học Spring Framework, đặc biệt là Spring Boot để xây dựng RESTful API, quản lý dependency, cấu trúc dự án theo chuẩn, và phát triển ứng dụng backend nhanh chóng.

5 Kiến thức về API và Web: Hiểu về REST API, HTTP methods, chuẩn hóa dữ liệu trả về, xử lý lỗi, xác thực và phân quyền (Spring Security, JWT).

6 Kiểm thử và bảo mật: Học viết unit test, integration test với JUnit, MockMvc; áp dụng bảo mật cho ứng dụng backend.

DevOps cơ bản và triển khai: Tìm hiểu Docker, CI/CD để triển khai ứng dụng backend lên môi trường thực tế.