package btvn02;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0){
            double x = -b / (2 * a);
            System.out.printf("Phương trình có nghiệm kép x = %.2f.", + x);
        } else if (delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Phương trình có hai nghiệm: x1 = %.2f, x2 = %.2f.", x1, x2);
        }

    }
}
