package btvn05;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        tongduongcheo();
    }
    static void tongduongcheo() {
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

        int sum = 0;
        for (int i = 0; i < n; i++) {
                sum += a[i][i];
            }

        System.out.println("Tổng đường chéo:" + sum);
    }
}
