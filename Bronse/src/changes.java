import java.util.Scanner;

public class changes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int changes = 1000 - price;

        int cnt = 0;
        // 500엔, 100엔, 50엔, 10엔, 5엔, 1엔

        while(changes != 0){
            cnt += changes / 500;
            changes = changes % 500;

            cnt += changes / 100;
            changes = changes % 100;

            cnt += changes / 50;
            changes = changes % 50;

            cnt += changes / 10;
            changes = changes % 10;

            cnt += changes / 5;
            changes = changes % 5;

            cnt += changes / 1;
            changes = changes % 1;
        }

        System.out.println(cnt);
        
    }
}