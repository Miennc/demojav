package operators;

public class OperatorDemo {
    public static void main(String[] args) {
        // Toán tử số học
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3
        System.out.println("a % b = " + (a % b)); // 1

        // Toán tử gán
        int c = 5;
        c += 2; // tương đương c = c + 2
        System.out.println("c += 2: " + c); // 7

        // Toán tử so sánh
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false

        // Toán tử logic
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false

        // Toán tử tăng/giảm
        int d = 5;
        System.out.println("d++: " + (d++)); // 5
        System.out.println("Sau d++ thì d = " + d); // 6
        System.out.println("++d: " + (++d)); // 7
        System.out.println("d--: " + (d--)); // 7
        System.out.println("Sau d-- thì d = " + d); // 6
    }
}
