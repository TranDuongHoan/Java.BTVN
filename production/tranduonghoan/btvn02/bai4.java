package btvn02;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày tháng năm sinh theo định dạng dd/MM/yyyy: ");
        String ngaySinhstr = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime ngaySinh = LocalDate.parse(ngaySinhstr, formatter).atStartOfDay();

        LocalDateTime hienTai = LocalDateTime.now();
        int namHienTai = hienTai.getYear();

        int tuoi = Period.between(ngaySinh.toLocalDate(), hienTai.toLocalDate()).getYears();

        System.out.println("Tuổi của người là: " + tuoi);
    }
}
