import java.util.HashSet;
import java.util.Scanner;

public class gomgom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        HashSet newSet = new HashSet<>();
        for (int i = 0; i < n; i++){
            String str = sc.next();
            if (str.equals("ENTER")){
                cnt += newSet.size();
                newSet.clear();
            } else{
                newSet.add(str);
            }
        }
        cnt += newSet.size();

        System.out.println(cnt);

    }
}
