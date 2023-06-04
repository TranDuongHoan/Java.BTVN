package btvn03;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chiều dài n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập vào chiều rộng m: ");
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
