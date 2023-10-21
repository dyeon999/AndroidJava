public class leastComonMul {
    public static void main(String[] args) {
        int a = 2, b = 9;
        int result = 0;
        int i = 1;
        if (a < b){
            result = b;
            while(i * b % a != 0){
                result = i * b;
                i++; 
            }
        } else {
            result = a;
            while(i * a % b != 0){
                result = i * a;
                i++; 
            }
        }

        System.out.println(result);
    }
}
