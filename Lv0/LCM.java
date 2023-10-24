public class LCM {
    public static void main(String[] args) {
        int a = 6, b = 9;
        int gcd= 0;
        if (a>b) gcd = gcd(a,b);
        else if(a<b) gcd = gcd(b,a);
        else if(a==b) gcd = a;

        int lmc = (a * b) / gcd;
        System.out.println(lmc);
    }

    public static int gcd(int a, int b) {
        if(a % b == 0) return b;
        else{
            return gcd(b, a%b);
        }
    }
}
