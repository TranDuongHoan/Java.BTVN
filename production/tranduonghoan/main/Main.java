package main;

import entity.Book;
import entity.Reader;
import statics.Specialization;
import statics.TypeReader;

import java.util.Scanner;

public class Main {
    private static Book[] books = new Book[10000];
    private static Reader[] readers = new Reader[10000];

    public static void main(String[] args){
        menu();
    }

    private static void menu() {
        while(true){
            showMenuContent();
            int choice = functionChoice();
            switch (choice){
                case 1:
                    inputNewBook();
                    break;
                case 2:
                    showBook();
                    break;
                case 3:
                    inputNewReader();
                    break;
                case 4:
                    showReader();
                    break;
                case 5:
                    return;
            }
        }
    }

    private static int functionChoice() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if(choice >= 1 && choice <= 5){
                break;
            }
            System.out.println("Nhập sai, mời nhập lại: ");
        } while(true);
        return choice;
    }

    private static void showMenuContent() {
        System.out.println("===========PHẦN MỀM QUẢN LÝ MƯỢN SÁCH===========");
        System.out.println("1. Nhập danh sách đầu sách mới.");
        System.out.println("2. In danh sách đầu sách.");
        System.out.println("3. Nhập danh sách bạn đọc mới.");
        System.out.println("4. In danh sách bạn đọc.");
        System.out.println("5. Thoát. ");
        System.out.println("Bạn hãy chọn: ");
    }

    private static void inputNewReader() {
        System.out.println("Bạn bao nhiêu bạn đọc:");
        int readerNumber = new Scanner(System.in).nextInt();
        for(int i = 0; i < readerNumber; i++) {
            System.out.println("Nhập thông tin cho người đọc" + (i+1));
            Reader reader = new Reader();
            System.out.println("Nhập mã người đọc:");
            reader.setId(new Scanner(System.in).nextInt());
            System.out.println("Nhập tên người đọc:");
            reader.setName(new Scanner(System.in).nextLine());
            System.out.println("Nhập địa chỉ người đọc:");
            reader.setAddress(new Scanner(System.in).nextLine());
            System.out.println("Nhập số điện thoại người đọc:");
            reader.setPhone(new Scanner(System.in).nextInt());
            System.out.println("Nhập người đọc:");
            System.out.println("1. Sinh viên");
            System.out.println("2. Học viên cao học");
            System.out.println("3. Giáo viên");
            System.out.println("Mời bạn chọn: ");
            int typeChoice = new Scanner(System.in).nextInt();
            switch (typeChoice){
                case 1:
                    reader.setType(TypeReader.SINH_VIEN);
                    break;
                case 2:
                    reader.setType(TypeReader.HOC_VIEN_CAO_HOC);
                    break;
                case 3:
                    reader.setType(TypeReader.GIAO_VIEN);
                    break;
            }
            saveReader(reader);
        }
    }

    private static void saveReader(Reader reader) {
        for (int j = 0; j < readers.length; j++) {
            if (readers[j] == null){
                readers[j] = reader;
                break;
            }
        }
    }

    private static void inputNewBook() {
        System.out.println("Bạn muốn thêm bao nhiêu đầu sách:");
        int bookNumber = new Scanner(System.in).nextInt();
        for(int i = 0; i < bookNumber; i++) {
            System.out.println("Nhập thông tin cho đầu sách" + (i+1));
            Book book = new Book();
            System.out.println("Nhập mã sách:");
            book.setId(new Scanner(System.in).nextInt());
            System.out.println("Nhập tên sách:");
            book.setName(new Scanner(System.in).nextLine());
            System.out.println("Nhập tác giả sách:");
            book.setAuthor(new Scanner(System.in).nextLine());
            System.out.println("Nhập chuyên ngành sách:");
            System.out.println("1. Khoa học tự nhiên");
            System.out.println("2. Văn học - Nghệ thuật");
            System.out.println("3. Điện tử viễn thông");
            System.out.println("4. Công nghệ thông tin");
            System.out.println("Mời bạn chọn: ");
            int specializationChoice = new Scanner(System.in).nextInt();
            switch (specializationChoice){
                case 1:
                    book.setSpecialization(Specialization.KHOA_HOC_TU_NHIEN);
                    break;
                case 2:
                    book.setSpecialization(Specialization.VAN_HOC_NGHE_THUAT);
                    break;
                case 3:
                    book.setSpecialization(Specialization.DIEN_TU_VIEN_THONG);
                    break;
                case 4:
                    book.setSpecialization(Specialization.CONG_NGHE_THONG_TIN);
                    break;
            }
            for (int j = 0; j < books.length; j++) {
                if (books[j] == null){
                    books[j] = book;
                    break;
                }
            }
            System.out.println("Nhập năm xuất bản:");
            book.setLocalTimeBook(String.valueOf(new Scanner(System.in).nextInt()));
        }
    }

    public static void showBook(){
        for (int j = 0; j < books.length; j++) {
            if (books[j] != null){
                System.out.println(books[j]);
            }
        }
    }

    public static void showReader(){
        for (int j = 0; j < readers.length; j++) {
            if (readers[j] != null){
                System.out.println(readers[j]);
            }
        }
    }
}

