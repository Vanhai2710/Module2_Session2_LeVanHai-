package Session02_Excercise;

//        [Bài tập] Tạo menu chức năng
//        1. Mục tiêu:
//        Luyện tập sử dụng cấu trúc vòng lặp while

//        2. Mô tả:
//        Trong phần này, chúng ta sẽ phát triển một ứng dụng nhiều chức năng
//        cho phép người dùng chọn chức năng để sử dụng

//        Menu gồm:
//        - Kiểm tra tính chẵn lẻ của 1 số
//        - Kiểm tra số nguyên tố
//        - Kiểm tra một số có chia hết cho 3 không
//        - Thoát

import java.util.Scanner;

public class Excercise_07 {
    public static void main(String[] args) {
        // khởi tạo dối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkEvenOdd();
                    break;
                case 2:
                    checkPrime(); // Gọi phương thức checkPrime()
                    break;
                case 3:
                    checkDivisibleByThree();
                    break;
                case 4:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
    }

    private static void displayMenu() {
        System.out.println("********** MENU **********");
        System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
        System.out.println("2. Kiểm tra số nguyên tố");
        System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
        System.out.println("4. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    private static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }

    // Phương thức kiểm tra số nguyên tố
    private static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
    }

    private static void checkDivisibleByThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println(number + " chia hết cho 3.");
        } else {
            System.out.println(number + " không chia hết cho 3.");
        }
    }
}
