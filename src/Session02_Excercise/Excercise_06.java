package Session02_Excercise;

//        [Bài tập] Hiển thị 20 số nguyên tố đầu tiên
//        1. Mục tiêu:
//        Luyện tập sử dụng biến, kiểu dữ liệu và các toán tử

//        2. Mô tả:
//        Trong phần này, chúng ta sẽ phát triển một ứng dụng
//        cho phép hiển thị 20 số nguyên tố đầu tiên

public class Excercise_06 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");

        int count = 0;
        int number = 2;

        // Sử dụng vòng lặp while
        while (count < 20) {
            int divisor = 2;

            // Kiểm tra xem number có phải là số nguyên tố
            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    break;
                }
                divisor++;
            }

            if (divisor > Math.sqrt(number)) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}
