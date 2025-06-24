package oop;

// Lớp Dog kế thừa từ Animal và phải cài đặt phương thức makeSound() của lớp cha
public class Dog extends Animal {
    @Override // Ghi đè phương thức trừu tượng từ Animal để định nghĩa tiếng kêu của chó
    public void makeSound() {
        System.out.println("Gâu gâu!");
    }
}
