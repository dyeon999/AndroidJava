import java.util.ArrayList;
import java.util.Scanner;

// 2231
// 브루트포스 알고리즘
public class discompositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;
        ArrayList<Integer> each = new ArrayList<Integer>();
        while(result < n){
            result++;
            int num = result;
            
            while(num != 0){
                each.add(num % 10);
                num = num / 10;
            }

            if (sum(each) + result == n){
                System.out.println(result);
                break;
            } else {
                each.clear();
            }
        }
        if (result == n) System.out.println(0);
    }

    private static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }
}
