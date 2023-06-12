package btvn05;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        lonnhatnhonhat();
    }

    static void lonnhatnhonhat() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số dòng n = ");
        int n = sc.nextInt();
        System.out.print("Nhập vào số cột m = ");
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        System.out.println("Nhập giá trị cho ma trận:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int min = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }

        System.out.println("Giá trị lớn nhất của ma trận là " + max);
        System.out.println("Giá trị nhỏ nhất của ma trận là " + min);
    }
}