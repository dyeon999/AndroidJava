import java.util.Scanner;

// 25304
public class receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long total = sc.nextInt();
        int n = sc.nextInt();
        long cnt = 0;

        for (int i = 0; i < n; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            cnt += a * b;
        }

        if (cnt == total) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
