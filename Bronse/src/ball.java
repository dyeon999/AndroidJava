import java.util.Scanner;

// 1547
public class ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cup = 1;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (cup == a){
                cup = b;
            }else if (cup == b){
                cup = a;
            }
        }

        System.out.println(cup);
    }
}
