import java.util.Scanner;

// 27433
public class factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Long f = factorial(n);
        System.out.println(f);
    }

    public static Long factorial(int k) {
        if (k == 0){
            return 1L;
        } else {
            Long result = factorial(k - 1) * k;
            return result;
        }

    }
}
