package eltity;

public class WorkingManagementDetail {
    private WorkShop workShop;
    private int workNumber;

    public WorkingManagementDetail(WorkShop workShop, int workNumber) {
        this.workShop = workShop;
        this.workNumber = workNumber;
    }

    public WorkShop getWorkShop() {
        return workShop;
    }

    public void setWorkShop(WorkShop workShop) {
        this.workShop = workShop;
    }

    public int getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(int workNumber) {
        this.workNumber = workNumber;
    }

    @Override
    public String toString() {
        return "WorkingManagementDetail{" +
                "workShop=" + workShop +
                ", workNumber=" + workNumber +
                '}';
    }
}
