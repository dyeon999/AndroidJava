import java.util.Scanner;

// 9655
public class stoneGame1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
