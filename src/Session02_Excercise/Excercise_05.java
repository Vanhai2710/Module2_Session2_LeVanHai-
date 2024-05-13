package Session02_Excercise;

//        [Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
//        1. Mục tiêu: Luyện tập sử dụng cấu trúc lặp

//        2. Mô tả:
//        - Trong phần này chúng ta sẽ phát triển một ứng dụng
//          cho phép hiển thị các số nguyên tố nhỏ hơn 100
//        - Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó

import java.util.Scanner;

public class Excercise_05 {
    public static void main(String[] args) {
        // Khởi tạo đối tường Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

        // Duyệt các số từ 2 đến 100
        for (int i = 2; i <= 100; i++) {
            int count = 0;

            // Kiểm tra i có phải số nguyên tố
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " ");
            }
        }
    }
}
