package Session02_Document;

import java.util.Scanner;

public class If_Else_Demo {
    public static void main(String[] args) {
        //1. Nhập vào 1 số nguyên, kiểm tra số nguyên là số chẵn hay số lẻ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.printf("%d là số chẵn\n", number);
        } else {
            System.out.printf("%d là số lẻ\n", number);
        }
        //2. In ra số dư trong phép chia 3 -- 0(chia hết), 1, 2
        if (number % 3 == 0) {
            System.out.printf("%d chia hết cho 3\n", number);
        } else if (number % 3 == 1) {
            System.out.printf("%d chia 3 dư 1\n", number);
        } else {
            System.out.printf("%d chia 3 dư 2\n", number);
        }
        //3. In ra số dư trong phép chia 5 -- chia hết, 1, 2, 3, 4 -- 1 if, 3 else-if, 1 else
    }
}
