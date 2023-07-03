package logichandle;

import eltity.WorkShop;
import eltity.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkShopLogicManagement {
    private List<WorkShop> workShops = new ArrayList<>();

    public List<WorkShop> getWorkShops() {
        return workShops;
    }

    public void inputNewWorkShop() {
        System.out.println("Bạn muốn thêm mới bao nhiêu xưởng sản xuất: ");
        int workShopNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < workShopNumber; i++) {
            System.out.println("Nhập thông tin cho xưởng sản xuất thứ" + ( i + 1 ));
            WorkShop workShop = new WorkShop();
            workShop.inputInfo();
            workShops.add(workShop);
        }
    }

    public void showWorkShop() {
        System.out.println(workShops);
    }

    public  boolean workShopIsNotEmpty() {
        return workShops.isEmpty();
    }
}
