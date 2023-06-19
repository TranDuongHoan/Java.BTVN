package statics;

public enum TypeReader {
    SINH_VIEN("Sinh viên"),
    HOC_VIEN_CAO_HOC("Học viên cao học"),
    GIAO_VIEN("Giáo viên");
    public String name;

    TypeReader(String name) {
        this.name = name;
    }
}
