import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        ArrayList<String> color = new ArrayList<>();

        color.add("black");
        color.add("brown");
        color.add("red");
        color.add("orange");
        color.add("yellow");
        color.add("green");
        color.add("blue");
        color.add("violet");
        color.add("grey");
        color.add("white");

        long resist = 0L;
        resist += color.indexOf(a) * 10;
        resist += color.indexOf(b);
        resist *= dtol(Math.pow(10, color.indexOf(c))) ;
        System.out.println(resist);
    }

    public static long dtol(double x){
        return (long) x;
    }
}
