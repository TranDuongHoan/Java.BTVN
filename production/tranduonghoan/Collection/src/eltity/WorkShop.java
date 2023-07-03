package eltity;

import java.util.Scanner;

public class WorkShop implements InputInfo{
    private static int AUTO_ID = 100;
    private int id;
    private String name;
    private String description;
    private double workfactor;

    public WorkShop() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWorkfactor() {
        return workfactor;
    }

    public void setWorkfactor(double workfactor) {
        this.workfactor = workfactor;
    }

    @Override
    public String toString() {
        return "WorkShop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", workfactor=" + workfactor +
                '}';
    }

    @Override
    public void inputInfo(){
        System.out.println("Nhập ID: ");
        this.setId(new Scanner(System.in).nextInt());
        System.out.println("Nhập tên xưởng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập mô tả: ");
        this.setDescription(new Scanner(System.in).nextLine());
        System.out.println("Nhập hệ số công việc: ");
        this.setWorkfactor(new Scanner(System.in).nextDouble());
    }
}
