import java.util.Arrays;
import java.util.Scanner;

public class bucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        // 처음 배열 설정
        for (int i = 0; i < n; i++){
            arr[i] = i + 1;
        }

        // m번 반복
        for (int i = 0; i < m; i++){
            int from = sc.nextInt();
            int to = sc.nextInt();

            if(from == to){
                continue;
            } else{
                int[] tmp = Arrays.copyOfRange(arr, from - 1, to);
                int length = tmp.length;
                for (int j = from - 1; j < to; j++){
                    arr[j] = tmp[length - 1 - (j - from + 1)];
                }
            }
        }

        for (int i = 0; i < n; i++){
            System.out.printf("%d", arr[i]);
        }
    }
}
