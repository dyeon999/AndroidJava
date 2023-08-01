import java.util.Scanner;

// 27866
public class charString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(str.charAt(n - 1));
    }
}
