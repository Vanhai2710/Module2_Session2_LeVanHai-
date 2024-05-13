package Session02_Excercise;

//        [Bài tập] Hiển thị ra những số chia hết cho cả 3 và 5
//        trong khoảng từ 1 đến 100
//        - Hệ thống sử dụng vòng lặp chạy từ 1 đến 100
//        - Sẽ sử dụng câu lệnh điều kiện để hiển thị
//        - Nếu có thì hiển thị ra số đó
//        - Nếu không thì không hiển thị ra gì cả

public class Excercise_03 {
    public static void main(String[] args) {
        // Duyệt qua các số từ 1 --> 100 và hiển thị kết quả
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " là số chia hết cho 3 và 5");
            }
        }
    }
}
