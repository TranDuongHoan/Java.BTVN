package eltity;

import java.util.Scanner;

public class Worker implements InputInfo{
    private static int AUTO_ID = 1000;
    private int id;
    private String name;
    private String address;
    private int phone;
    private int level;

    public Worker() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", level=" + level +
                '}';
    }
    @Override
    public void inputInfo(){
        System.out.println("Nhập ID: ");
        this.setId(new Scanner(System.in).nextInt());
        System.out.println("Nhập tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại: ");
        this.setPhone(new Scanner(System.in).nextInt());
        System.out.println("Nhập bậc thợ: ");
        this.setLevel(new Scanner(System.in).nextInt());
    }
}
