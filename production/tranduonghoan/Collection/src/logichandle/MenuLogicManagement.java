package logichandle;

import java.util.Scanner;

public class MenuLogicManagement {
    private final WorkerLogicManagement workerLogicManagement = new WorkerLogicManagement();
    private final WorkShopLogicManagement workShopLogicManagement = new WorkShopLogicManagement();
    private final WorkingLogicManagement workingLogicManagement = new WorkingLogicManagement(workerLogicManagement, workShopLogicManagement);

    public void menu() {
        while (true){
            showMenuContent();
            int choice = functionsChoice();
            switch (choice) {
                case 1:
                    workerLogicManagement.inputNewWorker();
                    break;
                case 2:
                    workerLogicManagement.showWorker();
                    break;
                case 3:
                    workShopLogicManagement.inputNewWorkShop();
                    break;
                case 4:
                    workShopLogicManagement.showWorkShop();
                    break;
                case 5:
                    workingLogicManagement.inputNewWorking();
                    break;
                case 6:
                    workingLogicManagement.showWorking();
                    break;
                case 7:
                    showSortMenu();
                    break;
                case 8:

                    break;
                case 9:
                    return;
            }
        }
    }

    private int functionsChoice() {
        int choice;
        do{
            choice = new Scanner(System.in).nextInt();
            if (choice>=1 && choice<=9){
                break;
            }
            System.out.println("Nhập sai, mời bạn nhập lại:");
        }
        while (true);
        return choice;
    }

    private void showMenuContent() {
        System.out.println("------------PHẦN MỀM QUẢN LÝ TRẢ LƯƠNG CÔNG NHÂN-------------");
        System.out.println("1. Thêm mới công nhân.");
        System.out.println("2. In danh sách công nhân.");
        System.out.println("3. Thêm mới xưởng sản xuất.");
        System.out.println("4. In danh sách xưởng sản xuất.");
        System.out.println("5. Lập bảng kê khai chấm công.");
        System.out.println("6. In bảng kê chấm công.");
        System.out.println("7. Sắp xếp bảng danh sách phân công.");
        System.out.println("8. Tính lương mỗi công nhân trong tháng.");
        System.out.println("9. THOÁT.");
        System.out.println("MỜI BẠN CHỌN: ");
    }

    private void showSortMenu() {
        System.out.println("1. Sắp xếp theo tên công nhân.");
        System.out.println("2. Sắp xếp theo xưởng sản xuất.");
        System.out.println("3. Quay lại menu tổng.");
        int choice;
        do{
            choice = new Scanner(System.in).nextInt();
            if (choice>=1 && choice<=3){
                break;
            }
            System.out.println("Nhập sai, mời bạn nhập lại:");
        }
        while (true);
        switch (choice) {
            case 1:
                workingLogicManagement.sortByWorkerName();
                break;
            case 2:
                workingLogicManagement.sortByWorkShopName();
                break;
            case 3:
                break;
        }
    }
}
