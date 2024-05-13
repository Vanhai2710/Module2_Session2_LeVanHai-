package Session02_Document;

public class Foreach_Demo {
    public static void main(String[] args) {
        int[] arrInt = {1, 3, 5, 7, 9};
        //In ra các phần tử của mảng
        System.out.println("Các phần tử trong mảng là:");
        for (int number : arrInt) {
            System.out.printf("%d\t", number);
        }
        System.out.printf("\n");
    }
}
