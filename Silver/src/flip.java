import java.util.Scanner;

// 1439
public class flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int flip = 0; 
        String str = sc.nextLine();

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) != str.charAt(i + 1)){
                flip++;
            }
        }

        System.out.println((flip + 1) / 2);
        
    }
}
