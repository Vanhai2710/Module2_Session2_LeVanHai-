package Session02_Document;

public class Jump_Demo {
    public static void main(String[] args) {
        //break: thoát khỏi switch...case và vòng lặp
        System.out.println("Câu lệnh break:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
        //continue: dừng vòng lặp hiện tại và chuyển sang vòng lặp tiếp theo
        System.out.println("Câu lệnh continue:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        //return: kết thúc phương thức và trả về nơi gọi nó
        System.out.println("Câu lệnh return:");
        int sum = sumTwoNumbers(5, 7);
        System.out.println("Tổng 5 và 7 là: " + sum);
    }

    public static int sumTwoNumbers(int firstNumber, int secondNumber) {
        int total = firstNumber + secondNumber;
        return total;
    }
}
