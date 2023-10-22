public class leastComonMul {
    public static void main(String[] args) {
        int a = 27, b = 18;
        int result = 0;
        int i = 1;
        if (a < b){
            while(true){
                result = i * b;
                if(result % a == 0){
                    break;
                }
                i++; 
            }
        } else {
            while(true){
                result = i * a;
                if(result % b == 0){
                    break;
                }
                i++; 
            }
        }

        System.out.println(result);
    }
}
