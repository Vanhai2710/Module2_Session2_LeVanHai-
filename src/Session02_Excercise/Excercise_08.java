package Session02_Excercise;
//        [Bài tập] Xác thực dữ liệu sử dụng vòng lặp
//        1. Mục tiêu:
//        Luyện tập sử dụng vòng lặp while
//
//        2. Mô tả:
//        Trong phần này, chúng ta sẽ phát triển một ứng dụng
//        cho phép người dùng nhập vào 3 cạnh của một tam giác
//        kiểm tra xem nếu 3 cạnh đấy thỏa mãn điều kiện trở thành 1 tam giác
//        thì cho phép tính diện tích và chu vi nếu không thì bắt người dùng nhập lại

import java.util.Scanner;

public class Excercise_08 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        int sideA, sideB, sideC;

        // sử dụng vòng lặp while
        while (true) {
            // Nhập 3 cạnh của tam giác
            System.out.println("Nhập cạnh a: ");
            sideA = scanner.nextInt();

            System.out.println("Nhập cạnh b: ");
            sideB = scanner.nextInt();

            System.out.println("Nhập cạnh c: ");
            sideC = scanner.nextInt();

            // Kiểm tra điều kiện tạo thành tam giác
            // Tổng 2 cạnh bất kì phải lớn hơn cạnh còn lại
            if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
                break;
            } else {
                System.out.println("Điều kiện không thỏa mãn. Mời nhập lại");
            }
        }

        // Tính chu vi tam giác
        int perimeter = sideA + sideB + sideC;

        // Tính diện tichs và chu vi tam giác
        int halfPerimeter = perimeter / 2;
        int area = (int) Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));

        // Hiển thị kết quả của chu vi và diện tích tam giác
        System.out.println("Chu vi tam giác là: " + perimeter);
        System.out.println("Diện tích tam giác là: " + area);
    }
}
