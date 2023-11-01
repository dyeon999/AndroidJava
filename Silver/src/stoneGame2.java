import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stoneGame2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());

        int[] dp = new int[n + 2];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 1;

        for (int i = 3; i < n; i++){
            if (dp[i-1] == 1 || dp[i-3] == 1){
                dp[i] = 2;
            } else {
                dp[i] = 1;
            }
        }

        System.out.println(dp[n-1] == 1 ? "CY" : "SK");
    }
}
