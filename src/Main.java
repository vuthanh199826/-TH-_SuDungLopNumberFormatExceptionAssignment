import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap y");
        int y = sc.nextInt();
        sc.nextLine();
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

}
