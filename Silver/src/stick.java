import java.util.ArrayList;
import java.util.Scanner;

//  1094

public class stick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> stick = new ArrayList<>();
        // int x = sc.nextInt();
        int x = 60;
        stick.add(64);

        if (x == 64){
            System.out.println(1);
        } else{
            while(true){
                int size = stick.size();
                int half = stick.get(size-1) / 2;
    
                stick.add(half);
                stick.add(half);
    
                stick.remove(size-1);

                if (sum(stick, stick.size() - 1) == x){
                    stick.remove(stick.size() - 1);
                    break;
                }else if(sum(stick, stick.size() - 1) > x){
                    stick.remove(stick.size() - 1);
                    continue;
                }else{
                    continue;
                }
            }

            System.out.println(stick.size());
        }
    }

    public static int sum(ArrayList<Integer> arr, Integer n) {
        int s = 0;
        
        for (int i = 0; i < n; i++){
            s += arr.get(i);
        }

        return s;
    }
}
