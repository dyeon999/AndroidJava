import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 2164

public class card2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> que = new LinkedList<Integer>();

        for (int i=1; i<=n; i++){
            que.add(i);
        }

        while (que.size() > 1){
            que.remove();
            int k = que.poll();
            que.add(k);
        }

        System.out.println(que.peek());
    }
}
