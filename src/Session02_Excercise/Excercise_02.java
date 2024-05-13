package Session02_Excercise;

//[Bài tập] Chuyển đổi số thành chữ
//        1. Mục tiêu:
//        Luyện tập sử dụng cú pháp switch case

//        2. Mô tả:
//        Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số từ 0 => 9 và hiển thị cách đọc của số đó trên màn hình
//        VD: người dùng nhập vào 1 thì hiển thị “Số Một”

import java.util.Scanner;

public class Excercise_02 {
    public static void main(String[] args) {
        // khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 1 số từ 0-9
        System.out.println("Nhập vào 1 số từ 0 đến 9: ");
        int number = Integer.parseInt(scanner.nextLine());

        // Sử dụng switch...case phiên âm số nhập vào
        switch (number) {
            case 0:
                System.out.println("Số không");
                break;
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            case 3:
                System.out.println("Số ba");
                break;
            case 4:
                System.out.println("Số bốn");
                break;
            case 5:
                System.out.println("Số năm");
                break;
            case 6:
                System.out.println("Số sáu");
                break;
            case 7:
                System.out.println("Số bảy");
                break;
            case 8:
                System.out.println("Số tám");
                break;
            default:
                System.out.println("Số chín");
        }
    }
}
