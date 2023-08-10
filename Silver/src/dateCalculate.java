import java.util.Scanner;

// 1476
// 브루트포스 알고리즘
public class dateCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int earth = sc.nextInt() - 1;
        int sun = sc.nextInt() - 1;
        int moon = sc.nextInt() - 1;
        int year = 0;

        while (year%15 != earth || year%28 != sun || year%19 != moon){
            year++;
        }
        System.out.println(year + 1);
    
    }
}
