import java.util.Scanner;

public class camping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int l = 1;
        // int p = 1;
        // int v = 1;
        int ca = 1;

        while(true){
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();

            if(v == 0){
                break;
            }

            int days = 0;
            int c = v / p;
            int left = v % p;

            days += l * c;
            if (left < l){
                days += left;
            } else{
                days += l;
            }

            System.out.printf("Case %d: %d", ca, days);
            days++;
        }

        
    }
    
}
