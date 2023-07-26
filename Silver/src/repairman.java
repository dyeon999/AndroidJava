import java.util.Arrays;
import java.util.Scanner;

// 1449
public class repairman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tape = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);

        int k = list[0] + tape;
        int cnt = 1;
        
        for (int i = 1; i < n; i++){
            if (list[i] < k){
                continue;
            }else {
                k = list[i] + tape;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
