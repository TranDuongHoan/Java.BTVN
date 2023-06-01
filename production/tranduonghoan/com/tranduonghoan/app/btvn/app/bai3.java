package btvn.app;

public class bai3 {
    public static void main(String[] args) {
        sosanhsolonnhat();
    }

    static void sosanhsolonnhat(){
        int a = 9;
        int b = 6;
        int c = 7;
        int d = 2;
        int max_num = a;

        if (b > max_num) {
            max_num = b;
        }
        if (c > max_num) {
            max_num = c;
        }
        if (d > max_num) {
            max_num = d;
        }
        System.out.println("Số lớn nhất:" + max_num);
    }
}
