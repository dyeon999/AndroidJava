import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buildBridge {
    static int[][] bridge = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());
        int n, m = 0;

        for (int i = 0; i < t; i++){
            String[] input = bf.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);

            System.out.println(combination(m, n));
        }
    }

    private static int combination(int n, int r){
        if (bridge[n][r] > 0){
            return bridge[n][r];
        } else if (n == r || r == 0){
            bridge[n][r] = 1;
            return bridge[n][r];
        } else{
            return combination(n-1, r-1) + combination(n-1, r);
        }

    }

}
