import java.io.*;
import java.util.*;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] list = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i <n; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += list[i] * (n-i);
        }

        System.out.println(sum);
    }
}
