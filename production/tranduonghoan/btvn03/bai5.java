package btvn03;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Số nhập vào không phải là số nguyên dương.");
            return;
        }


        int daonguocso = 0;
        int soNumber = n;
        while (soNumber > 0) {
            int digit = soNumber % 10;
            daonguocso = daonguocso * 10 + digit;
            soNumber /= 10;
        }
        System.out.println("Số đảo ngược là: " + daonguocso);
    }
}
