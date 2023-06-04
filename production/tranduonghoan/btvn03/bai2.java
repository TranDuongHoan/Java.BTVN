package btvn03;

public class bai2 {
    public static void main(String[] args) {
        String str = "test string";
        int[] charCount = new int[256]; // mảng đếm số lần xuất hiện của các ký tự (ASCII)

        // duyệt qua từng ký tự trong chuỗi và tăng giá trị đếm tương ứng
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //lấy ký tự ở vị trí i trong chuỗi str và gán vào biến ch.
            charCount[ch]++;
        }

        // tìm ký tự có số lần xuất hiện nhiều nhất
        char mostFrequentChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char) i;//kiểm tra số lần xuất hiện của ký tự có mã ASCII i và
                // cập nhật giá trị của biến mostFrequentChar nếu ký tự đó xuất hiện nhiều hơn
                // ký tự hiện tại đang được lưu trữ
            }
        }

        System.out.println("Ký tự xuất hiện nhiều nhất trong chuỗi \"" + str + "\" là: " + mostFrequentChar);
    }
}
