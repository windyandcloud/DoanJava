
import java.util.Scanner;

public class bai1btvn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên
        System.out.print("Nhap so nguyen thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int b = scanner.nextInt();

        // Tìm ước số chung lớn nhất
        int ucln = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }

        }
        // In kết quả
        System.out.println("Uoc so chung lon nhat cua  " + a + " va " + b + " la: " + ucln);
        scanner.close();
    }
}
