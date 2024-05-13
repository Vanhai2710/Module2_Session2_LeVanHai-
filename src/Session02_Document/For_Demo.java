package Session02_Document;

public class For_Demo {
    public static void main(String[] args) {
        //In ra các số từ 1-10
        System.out.println("Các số từ 1-10 là:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");
        //In ra các số chẵn trong khoảng 1-10
        //i+=2 -> i = i +2
        System.out.println("Các số chẵn trong khoảng 1-10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");
        //Tính điểm trung bình trong khoảng 0-10
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--) {
            //i = 0, j=10
            //i = 1, j=9
            //i = 2, j=8
            //i = 3, j = 7
            //i = 4, j=6
            //i = 5, j = 5
        }
        System.out.println("Điểm trung bình: " + i);
    }
}
