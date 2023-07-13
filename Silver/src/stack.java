
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.io.IOException; 

// 10828
public class stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++){
            String[] cmd = br.readLine().split(" ");
            switch(cmd[0]){
                case "push": {
                    stack.push(Integer.parseInt(cmd[1]));
                    break;
                }
                case "pop": {
                    if(stack.empty()) bw.write("-1" + "\n");
                    else bw.write(stack.pop() + "\n");
                    break;
                }

                case "size": 
                    bw.write(stack.size() + "\n");
                    break;

                case "empty": {
                    if(stack.empty()) bw.write("1" + "\n");
                    else bw.write("0" + "\n");
                    break;
                }
                
                case "top": {
                    if(stack.empty()) bw.write("-1" + "\n");
                    else bw.write(stack.peek() + "\n");
                    break;
                }
                
                default :
                    break; 
            }
        }
        bw.flush();
        bw.close();
    }
}
