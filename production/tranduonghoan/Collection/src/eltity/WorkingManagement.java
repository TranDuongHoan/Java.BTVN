package eltity;

import java.util.List;

public class WorkingManagement {
    private Worker worker;
    private List<WorkingManagementDetail> details;
    private int total;

    public WorkingManagement(Worker worker, List<WorkingManagementDetail> details, int total) {
        this.worker = worker;
        this.details = details;
        this.total = total;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public List<WorkingManagementDetail> getDetails() {
        return details;
    }

    public void setDetails(List<WorkingManagementDetail> details) {
        this.details = details;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "WorkingManagement{" +
                "worker=" + worker +
                ", details=" + details +
                ", total=" + total +
                '}';
    }
}