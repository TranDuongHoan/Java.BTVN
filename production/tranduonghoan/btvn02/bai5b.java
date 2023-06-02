package btvn02;

import java.util.Scanner;

public class bai5b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi s: ");
        String s = scanner.nextLine();
        System.out.print("Nhập chuỗi con s1 cần tìm: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập chuỗi s2 để thay thế: ");
        String s2 = scanner.nextLine();

        String ketQua = s.replaceAll(s1, s2);

        System.out.println("Chuỗi kết quả sau khi thay thế là: " + ketQua);
    }
}
