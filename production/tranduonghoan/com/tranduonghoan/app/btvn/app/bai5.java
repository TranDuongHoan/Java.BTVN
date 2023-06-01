package btvn.app;

public class bai5 {
    public static void main(String[] args) {
        thuong2songuyen();
    }

    static void thuong2songuyen(){
        int a = 20;
        int b = 6;
        double  c = (double) a / b;

        c = Math.round(c * 1000.0) / 1000.0;

        System.out.println("Thuong so c =" + c);
    }
}
