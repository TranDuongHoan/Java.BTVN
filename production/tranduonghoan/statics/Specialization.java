package statics;

public enum Specialization {
    KHOA_HOC_TU_NHIEN("Khoa học tự nhiên"),
    VAN_HOC_NGHE_THUAT("Văn học - Nghệ thuật"),
    DIEN_TU_VIEN_THONG("Điện tử Viễn thông"),
    CONG_NGHE_THONG_TIN("Công nghệ thông tin");
    public String name;

    Specialization(String name) {
        this.name = name;
    }
}
