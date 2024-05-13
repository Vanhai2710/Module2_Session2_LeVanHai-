package Session02_Excercise;

//        [Bài tập] Tính tổng các số chẵn trong khoảng cho trước
//        1. Mục tiêu:
//        Luyện tập sử dụng cấu trúc vòng lặp for

//        2. Mô tả:
//        Trong phần này, chúng ta sẽ phát triển một ứng dụng
//        cho phép người dùng nhập vào 1 khoảng số tự nhiên
//        và yêu cầu tính tổng các số chẵn nằm trong khoảng đó

import java.util.Scanner;

public class Excercise_04 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập khoảng số tự nhiên
        System.out.println("Số bắt đầu của khoảng: ");
        int start = scanner.nextInt();

        System.out.println("Số kết thúc của khoảng: ");
        int end = scanner.nextInt();

        // Khởi tạo biến để tính tổng các số chẵn
        int sum = 0;

        // Sử dụng vòng lặp for để duyệt
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        // hiển thị tổng các số chẵn trong khoảng
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);
    }
}
