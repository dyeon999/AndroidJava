import java.util.Scanner;

// 2798
// 브루트포스 알고리즘
public class blackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cardList = new int[n];

        for (int i = 0; i < n; i++){
            cardList[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n-2; i++){
            for (int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int sum = cardList[i] + cardList[j] + cardList[k];
                    if (sum <= m){
                        max = Math.max(max, sum);
                    }
                    if (max == m) {
                        System.out.println(max);
                        return;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
