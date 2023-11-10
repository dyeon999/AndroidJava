import java.io.*;
import java.util.*;

public class jumpRope {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] list = new int[1001];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++){
            list[Integer.valueOf(st.nextToken())]++;
        }

        int cnt = 0;
        for (int i = 0; i < 1001; i++){
            if (list[i] > 1){
                cnt += 2;
            }else if (list[i] > 0){
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }

}
