import java.util.ArrayList;
import java.util.Scanner;

// 3052
public class remain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Boolean x = false;
            arr.add(sc.nextInt() % 42);
            if(i == 0) continue;
            for(int j = 0; j < i; j++){
                if(arr.get(i) == arr.get(j)){
                    x = true;
                    break;
                }
            }
            if (x == false) cnt ++;
        }
        System.out.println(cnt);
    }
}
