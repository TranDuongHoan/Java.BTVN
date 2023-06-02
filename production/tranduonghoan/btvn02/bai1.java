package btvn02;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double x = -b/a;
            System.out.println("Nghiệm của phương trình " + a + "x + " + b + " = 0 là: " + x);
        } else {
            System.out.println("Phương trình không hợp lệ vì a = 0");
        }
    }
}
