package Session02_Excercise;

// [Bài tập] Kiểm tra 1 số có chia hết cho 3 và 5

// Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số tự nhiên
// và kiểm tra xem số đó có chia hết cho 3 và 5 hay không

import java.util.Scanner;

public class Excercise_01 {
    public static void main(String[] args) {
        // khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            // Nhập số tự nhiên
            System.out.println("Nhập vào số tự nhiên: ");
            number = scanner.nextInt();

            // Kiểm tra số có chia hết cho 3 và 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " chia hết cho 3 và 5.");
            } else {
                System.out.println(number + " không chia hết cho 3 và 5.");
            }
        } while (true);
    }
}
