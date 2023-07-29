import java.util.Scanner;

// 2444
public class stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 1; j < n - i - 1 + 1; j++){
                System.out.printf(" ");
            }
            for (int j = 0; j < 2*i + 1; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < i + 1; j++){
                System.out.printf(" ");
            }
            for (int j = 2*i + 1; j < 2*n - 2; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
