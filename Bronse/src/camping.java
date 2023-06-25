import java.util.Scanner;

// 4796
public class camping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ca = 1;

        while(true){
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();

            if(v == 0 || l == 0 || p == 0){
                break;
            }

            int days = 0;
            int c = v / p;
            int left = v % p;

            days += l * c + Math.min(l, left);

            System.out.printf("Case %d: %d \n", ca, days);
            ca++;
        }

        
    }
    
}
