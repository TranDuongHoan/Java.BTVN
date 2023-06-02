package btvn02;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        System.out.print("Nhập ký tự cần tìm: ");
        char kyTu = sc.next().charAt(0);

        int viTriDauTien = chuoi.indexOf(kyTu);
        int viTriCuoiCung = chuoi.lastIndexOf(kyTu);

        if (viTriDauTien == -1) {
            System.out.println("Không tìm thấy ký tự trong chuỗi!");
        } else {
            System.out.println("Vị trí xuất hiện đầu tiên của ký tự là: " + viTriDauTien);
            System.out.println("Vị trí xuất hiện cuối cùng của ký tự là: " + viTriCuoiCung);
        }
    }
}

