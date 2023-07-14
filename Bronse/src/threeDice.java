import java.util.Scanner;

// 2480
public class threeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int n = x;
        int price = 0;

        if(x != y && y != z && z != x){  // 셋 다 다른 상황
            n = max(x, y, z);
            price = n * 100;
        } else {  // 두 개 이상 같은 상황
            if (x == y || x == z){
                if(y == z){  // 셋 다 같은 상황
                    price = 10000 + n * 1000;
                } else {  // y만 다르거나 z만 다를때
                    price = 1000 + n * 100;
                }
            } else {  // x만 다를 때
                n = y;
                price = 1000 + n * 100;
            }
        }

        System.out.println(price);
    }

    public static Integer max(int a, int b, int c) {
        int max = a;
        
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }
}
