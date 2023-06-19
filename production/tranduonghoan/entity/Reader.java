package entity;

import statics.TypeReader;

public class Reader extends Person{

    private static int AUTO_ID = 10000;
    private int id;
    private TypeReader type;

    public Reader() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeReader getType() {
        return type;
    }

    public void setType(TypeReader type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
