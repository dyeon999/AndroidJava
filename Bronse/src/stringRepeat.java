import java.util.Scanner;

// 2675
public class stringRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            String str = sc.next();
            String result = "";
            for (int j = 0; j < str.length(); j++){
                for(int k = 0; k < m; k++){
                    result = result + str.charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}
