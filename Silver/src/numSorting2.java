import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class numSorting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
