import java.util.Scanner;

// 1049
public class guitarString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); //  string number
            int m = sc.nextInt(); //  market number
            int gn = n / 6;
            int lo = n % 6;
            int gr;
            int sg;
            int tmp;

            if(lo == 0){
                tmp = gn;
            } else tmp = gn + 1;
    
            int[] group = new int[50];
            int[] single = new int[50];
            int price = 0;
    
            for(int i = 0; i < m; i++){
                group[i] = sc.nextInt();
                single[i] = sc.nextInt();
            }
    
            gr = group[0];
            sg = single[0];
    
            for(int i = 0; i < m; i++){
                if(gr > group[i]){gr = group[i];}
                if(sg > single[i]){sg = single[i];}
            }
    
            price = gr * gn + sg * lo;

            for(int i = 0; i < m; i++){
                if (price > (single[i] * n)){
                    price = single[i] * n;
                }
                if (price > (group[i] * tmp)){
                    price = group[i] * tmp;
                }
            }

            System.out.println(price);
    }

}
