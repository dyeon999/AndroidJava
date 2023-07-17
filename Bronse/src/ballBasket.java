import java.util.Scanner;

// 10813
public class ballBasket {
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
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == b){
                continue;
            }else{
                int tmp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = tmp;
            }
        }

        for (int i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}