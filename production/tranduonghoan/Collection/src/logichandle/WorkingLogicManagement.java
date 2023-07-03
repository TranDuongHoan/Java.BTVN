package logichandle;

import eltity.WorkShop;
import eltity.Worker;
import eltity.WorkingManagement;
import eltity.WorkingManagementDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkingLogicManagement {
    private final List<WorkingManagement> workingManagements = new ArrayList<>();
    private WorkerLogicManagement workerLogicManagement;
    private WorkShopLogicManagement workShopLogicManagement;

    public WorkingLogicManagement(WorkerLogicManagement workerLogicManagement, WorkShopLogicManagement workShopLogicManagement) {
        this.workerLogicManagement = workerLogicManagement;
        this.workShopLogicManagement = workShopLogicManagement;
    }

    public void inputNewWorking() {
        if(!workerLogicManagement.workerIsNotEmpty() || !workShopLogicManagement.workShopIsNotEmpty()) {
            System.out.println("Không có dữ liệu về công nhân hoặc xưởng sản xuất, vui lòng tạo đủ dư liệu trước khi phân công:");
            return;
        }
        System.out.println("Nhập số công nhân bạn muốn phân công:");
        int workerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < workerNumber; i++) {
            System.out.println("Nhập thông tin cho công nhân thứ" + (i + 1) + "muốn phân công.");
            System.out.println("Nhập ID công nhân:");
            int workerId;
            Worker worker = null;
            do{
                workerId = new Scanner(System.in).nextInt();
                for (int j = 0; j < workerLogicManagement.getWorkers().size(); j++) {
                    if (workerLogicManagement.getWorkers().get(j).getId() == workerId) {
                        worker = workerLogicManagement.getWorkers().get(j);
                        break;
                    }
                }
                if (worker != null) {
                    break;
                }
                System.out.println("Không tồn tại ID công nhân vừa nhập, xin vui lòng nhập lại: ");
            }while (true);

            System.out.println("Công nhân này làm bao nhiêu xưởng: ");
            int workShopNumber = new Scanner(System.in).nextInt();
            List<WorkingManagementDetail> details = new ArrayList<>();
            int total = 0;
            for (int j = 0; j < workShopNumber; j++) {
                System.out.println("Xưởng sản xuất thứ " + (j + 1) + "mà công nhân này muốn làm là xưởng nào: ");
                int workShopId;
                WorkShop workShop = null;
                do{
                    workShopId = new Scanner(System.in).nextInt();
                    for (int k = 0; k < workShopLogicManagement.getWorkShops().size(); k++) {
                        if (workShopLogicManagement.getWorkShops().get(k).getId() == workerId) {
                            workShop = workShopLogicManagement.getWorkShops().get(k);
                            break;
                        }
                    }
                    if (workShop != null) {
                        break;
                    }
                    System.out.println("Không tồn tại xưởng sản xuất có ID vừa nhập, xin vui lòng nhập lại: ");
                }while (true);

                System.out.println("Xưởng sản xuất này ông làm bao nhiêu công việc:");
                int workNumber;
                do {
                    workNumber = new Scanner(System.in).nextInt();
                    if (workNumber < 1 || workNumber > 20) {
                        System.out.println("Số công việc phải là số dương và nhỏ hơn 20.");
                        continue;
                    }
                    int temp = total;
                    temp+=workNumber * workShop.getWorkfactor();
                    if (temp > 30){
                        System.out.println("Nếu tổng số ngày làm việc quá 30,thì vui lòng nhập lại: ");
                        continue;
                    }
                    break;
                } while (true);
                WorkingManagementDetail workingManagementDetail = new WorkingManagementDetail(workShop, workNumber);
                details.add(workingManagementDetail);
                total += workNumber * workShop.getWorkfactor();
            }

            WorkingManagement workingManagement = new WorkingManagement(worker, details, total);
            workingManagements.add(workingManagement);
        }
    }

    public void showWorking(){
        System.out.println(workingManagements);
    }

    public  boolean isEmptyWorking() {
        return workingManagements.isEmpty();
    }

    public void sortByWorkerName() {
        if (isEmptyWorking()){
            System.out.println("Chưa có dự liệu công nhân, vui lòng nhập dữ liệu trước khi sắp xếp");
            return;
        }

        for (int i = 0; i < workingManagements.size() -1; i++){
            for (int j = i+1; j < workingManagements.size(); j++){
                if(workingManagements.get(i).getWorker().getName().compareToIgnoreCase(workingManagements.get(j).getWorker().getName()) > 0){
                    WorkingManagement temp = workingManagements.get(i);
                    workingManagements[i] = workingManagements[j];
                    workingManagements[j] = temp;
                }
            }
        }
        showWorking();
    }

    public void sortByWorkShopName() {
        if (isEmptyWorking()){
            System.out.println("Chưa có dự liệu xưởng sản xuất, vui lòng nhập dữ liệu trước khi sắp xếp");
            return;
        }
        for (int i = 0; i < workingManagements.size() -1; i++){
            for (int j = i+1; j < workingManagements.size(); j++){
                if(workingManagements.get(i).getDetails().get().compareToIgnoreCase(workingManagements.get(j).getWorker().getName()) > 0){
                    WorkingManagement temp = workingManagements.get(i);
                    workingManagements.get(i) = workingManagements.get(j);
                    workingManagements.get(j) = temp;
                }
            }
        }
        showWorking();
    }

}
