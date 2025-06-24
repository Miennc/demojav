package oop;

// Lớp Student kế thừa từ Person (tính kế thừa) và bổ sung thuộc tính riêng
public class Student extends Person {
    // Thuộc tính riêng của Student: mã sinh viên
    private String studentId;

    // Constructor nhận thêm studentId, gọi lại constructor của Person để khởi tạo name và age
    public Student(String name, int age, String studentId) {
        super(name, age); // Gọi constructor của Person
        this.studentId = studentId;
    }

    // Ghi đè phương thức introduce để minh họa đa hình: giới thiệu thêm mã sinh viên
    @Override
    public void introduce() {
        System.out.println("Tôi là sinh viên: " + getName() + ", " + getAge() + " tuổi, mã SV: " + studentId);
    }

    // Getter cho studentId: trả về mã sinh viên
    public String getStudentId() {
        return studentId;
    }

    // Setter cho studentId: thay đổi mã sinh viên
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
