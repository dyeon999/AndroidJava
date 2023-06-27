import java.util.Scanner;

// 1075
public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();

        int remain = 0;

        n = n / 100;
        n = n * 100;

        while(n % f != 0){
            n++;
            remain++;
        }

        if(remain < 10){
            System.out.printf("0%d \n", remain);
        }else{
            System.out.println(remain);
        }
    }
    
}
