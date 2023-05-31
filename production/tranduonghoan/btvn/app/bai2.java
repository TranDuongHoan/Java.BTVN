package btvn.app;

public class bai2 {
    public static void main(String[] args) {
        Chuvi();
        Dientich();
    }

    static void Chuvi(){
        int a = 25;
        final double PI = 3.14;
        double c = (a*2)*PI;
        System.out.println("Chu vi c =" + c);
    }

    static  void Dientich(){
        int a = 25;
        final double PI = 3.14;
        double s = a * a * PI;
        System.out.println("Dien tich s =" + s);
    }
}
