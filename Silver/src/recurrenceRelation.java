import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recurrenceRelation {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        long k = 0;
        long[] list = new long[36];

        list[0] = 1;
        list[1] = 1;
        for (int i = 2; i <= n; i++){
            for (int j = 0; j < i; j++){
                list[i] += (list[j] * list[i-j-1]);
                k = list[i];
            }
        }

        System.out.println(list[n]);

    }

    // private static int recursion(int n) {
    //     int result = 0;
        
    //     if (n == 0){
    //         list[n] = 1;
    //     } else if (n == 1){
    //         list[n] = 1;
    //     } else {
    //         list[n] = list[n-1] + 
    //     }
    //     list[n] = recursion(n);

    //     return result;
    // }
}
