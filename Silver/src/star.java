import java.util.Scanner;
// 16505
public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String [][] result = stars(n);

        print(n, result);
    }

    private static String[][] stars(int k) {
        String[][] star = new String[1024][1024];
        if (k == 0) {
            star[0][0] = "*";
        } else {
            String[][] old = stars(k-1);
            int pow = (int) Math.pow(2, k-1);
            for (int i=0; i<pow; i++){
                for (int j=0; j<pow; j++){
                    star[i][j] = old[i][j];
                }
                for (int j=pow; j<Math.pow(2, k); j++){
                    star[i][j] = old[i][j-pow];
                }
            }
            for (int i=pow; i<Math.pow(2, k); i++){
                for (int j=0; j<pow; j++){
                    star[i][j] = old[i-pow][j];
                }
                for (int j=pow; j<Math.pow(2, k); j++){
                    star[i][j] = " ";
                }
            }
        }
        return star;
    }

    private static void print(int k, String[][] str) {
        int m = (int) Math.pow(2,k);
        for (int i = 0; i < m; i++){
            for (int j = 0; j < m - i; j++){
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
}
