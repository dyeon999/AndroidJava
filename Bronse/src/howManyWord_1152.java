import java.util.Scanner;

public class howManyWord_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        // String sentence = " The lastcharacter is a blank";

        if(sentence.indexOf(" ") == 0){
            sentence = sentence.substring(1);
        }

        String word[] = sentence.split(" ");

        int cnt = word.length;

        if(word[word.length - 1].length() == 0) {
            cnt -= 1;
        }
        System.out.println(cnt);
    }
    
}
