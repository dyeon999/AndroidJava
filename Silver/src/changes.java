import java.util.Scanner;
// 14916
public class changes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int a,b;

        if(price % 2 == 1){  // 홀수
            if(price < 5){
                System.out.println(-1);
            } else{
                a = price / 5;
                if(a % 2 == 0){
                    a = a - 1;
                }
                b = (price - a * 5) / 2;
                System.out.println(a + b);
            }
        } else {  // 짝수
            a = price / 5;
            if(a % 2 != 0){
                a = a - 1;
            }
            b = (price - a * 5) / 2;
            System.out.println(a + b);
        }
    }
}
