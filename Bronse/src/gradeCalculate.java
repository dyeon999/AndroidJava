import java.util.Scanner;

// 2754
public class gradeCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmp = sc.next();
        char[] grade = tmp.toCharArray();
        float cnt = 0;

        switch (grade[0]){
            case 'A': cnt += 4;
                break;
            case 'B': cnt += 3;
                break;
            case 'C': cnt += 2;
                break;
            case 'D': cnt += 1;
                break;
            case 'F': cnt += 0;
                break;
        }

        if(grade.length != 1){
            switch (grade[1]){
                case '+': cnt += 0.3;
                    break;
                case '-': cnt -= 0.3;
                    break;
                default: break;
            }
        }
    

        System.out.println(cnt);
    }
}
