package btvn02;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        chuvi();
        dientich();
    }
    static void chuvi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        double c = (a+b)*2;

        System.out.printf("Chu vi của hình chữ nhật là %.2f\n", + c);
    }

    static void dientich(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        double s = a*b;

        System.out.printf("Dien tich của hình chữ nhật là %.2f\n", + s);
    }
}
