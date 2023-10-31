import java.io.*;
import java.util.*;

public class zero {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(bf.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++){
            int temp = Integer.parseInt(bf.readLine());
            if(temp == 0){
                stack.pop();
            } else {
                stack.push(temp);
            }
        }

        while(stack.size() != 0){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
