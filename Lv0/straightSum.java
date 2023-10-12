import java.util.Scanner;

public class straightSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = sc.nextInt();
        int[] answer = new int[num];
        int start = (total/num) - (num-1)/2;
        for (int i = 0; i < num; i++){
            answer[i] = start;
            start++;
        }
        print(answer);
    }
    public static void print(int[] list) {
        String answer = new String();
        answer = "[";
        for (int i = 0; i < list.length - 1; i++){
            answer += Integer.toString(list[i]) + ", ";
        }
        answer += Integer.toString(list[list.length-1]);
        answer += "]";
        System.out.println(answer);
    }
}