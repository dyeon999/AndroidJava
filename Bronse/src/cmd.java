import java.util.Scanner;

public class cmd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = new String[50];
        char[] pattern = new char[100];

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            input[i] = sc.next();
        }

        if(n == 1){
            System.out.println(input[0]);
        } else
        {
            int m = input[0].length();

            for(int i = 0; i < m; i++){
                pattern[i] = input[0].charAt(i);
            }

            for(int i = 1; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(pattern[j] == input[i].charAt(j)){
                        continue;
                    } else{
                        pattern[j] = '?';
                    }
                }
            }

            for(int i = 0; i < m; i++){
                System.out.printf("%c", pattern[i]);
            }
        }
    
    }
}
