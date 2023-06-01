package btvn.app;

public class bai4 {
    public static void main(String[] args) {
        khaicansoduong();
    }
    static void khaicansoduong(){
        double a = 56.0;
        double x = Math.sqrt(a);

        x = Math.round(x * 1000.0) / 1000.0;

        System.out.println("Căn bậc hai của " + a + " là " + x);
    }
}
