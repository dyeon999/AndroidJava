import java.util.ArrayList;
import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            arr.add(x);
        }

        int max = getMax(arr);
        int min = getMin(arr);

        System.out.println(max * min);
        
    }

    private static int getMax(ArrayList<Integer> arr){
        int max = arr.get(0);

        for (int i = 1; i < arr.size(); i++){
            int tmp = arr.get(i);
            if(max > tmp){
                continue;
            } else {
                max = tmp;
            }
        }

        return max;
    }

    private static int getMin(ArrayList<Integer> arr){
        int min = arr.get(0);

        for (int i = 1; i < arr.size(); i++){
            int tmp = arr.get(i);
            if(min < tmp){
                continue;
            } else {
                min = tmp;
            }
        }

        return min;
    }
}
