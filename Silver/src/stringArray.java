import java.util.Scanner;

public class stringArray {
    // 1120 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String astr = sc.next();
        String bstr = sc.next();

        int alen = astr.length();
        int blen = bstr.length();
        int cnt = 0;

        if (alen == blen){
            for(int i = 0; i < alen; i++){
                if(astr.charAt(i) != bstr.charAt(i)){
                    cnt++;
                }
            }
        }else {
            int tmp = 0;
            for (int i = 0; i < alen; i++){
                if(astr.charAt(i) != bstr.charAt(i)){
                    cnt++;
                }
            }
            for(int i = 1; i < (blen - alen + 1); i++){
                for (int j = 0; j < alen; j++){
                    if(astr.charAt(j) != bstr.charAt(j + i)){
                        tmp++;
                    }
                }
                if (tmp < cnt){
                    cnt = tmp;
                }
                tmp = 0;
            }
        }

        System.out.println(cnt);
    }
}
