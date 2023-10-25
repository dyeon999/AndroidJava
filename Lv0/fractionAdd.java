public class fractionAdd {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        int[] answer = new int[2];
        int a = numer1 * denom2;
        int b = numer2 * denom1;
        int num = a + b;
        int den = denom1 * denom2;
        if (gcd(num, den) != 1){
            answer[0] = num/gcd(num, den);
            answer[1] = den/gcd(num, den);
        } else {
            answer[0] = num;
            answer[1] = den;
        }
        print(answer);
    }

    public static int gcd(int a, int b){
        if(a % b == 0) return b;
        else{
            return gcd(b, a%b);
        }
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