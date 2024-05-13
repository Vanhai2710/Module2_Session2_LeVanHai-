package Session02_Document;

import java.util.Scanner;

public class While_Demo {
    public static void main(String[] args) {
        //Tính tổng các số nhập từ bàn phím, kết thúc nhập khi nhập vào giá trị 0
        int sum = 0;
        int number = 1;
        Scanner scanner = new Scanner(System.in);
        while (number != 0) {
            System.out.println("Nhập vào 1 số:");
            number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println("Tổng các số vừa nhập là: "+sum);
    }
}
