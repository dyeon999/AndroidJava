import java.util.Scanner;

// 11047
public class coin0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n = sc.nextInt();
        int total = sc.nextInt();
        int[] list = new int[n];

        for(int i = 0; i < n; i++){
            list[n - i - 1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            cnt += total / list[i];
            total = total % list[i];
        }

        System.out.println(cnt);
    }
}
