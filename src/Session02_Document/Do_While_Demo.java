package Session02_Document;

import java.util.Scanner;

public class Do_While_Demo {
    public static void main(String[] args) {
        //In ra menu và thực hiện các chức năng theo menu sau
        /*
         * *************MENU*************
         * 1. Phở bò Kobe
         * 2. Phở gà Việt Nam
         * 3. Xôi pate
         * 4. Bánh mỳ trứng
         * 5. Mỳ tôm không người lái
         * 6. Thoát
         * */
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**************MENU*************");
            System.out.println("1. Phở bò Kobe");
            System.out.println("2. Phở gà Việt Nam");
            System.out.println("3. Xôi Pate");
            System.out.println("4. Bánh mỳ trứng");
            System.out.println("5. Mỳ tôm không người lái");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn phở bò Kobe");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn phở gà Việt Nam");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn xôi pate");
                    break;
                case 4:
                    System.out.println("Bạn vừa chon bánh mỳ trứng");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn mỳ tôm không người lái");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-6");
            }
        } while (true);
    }
}
