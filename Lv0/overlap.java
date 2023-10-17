import java.util.ArrayList;

public class overlap {
    public static void main(String[] args) {
        int answer;
        int cnt = 0;
        int[][] lines = {{0,1}, {2,5}, {3,9}};
        ArrayList list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++){
            for (int j = lines[i][0]; j < lines[i][1]; j++){
                if (find(list, j) == 1){
                    cnt++;
                    list.remove(j);
                } else{
                    list.add(j);
                }
            }
        }

        answer = cnt;
        System.out.println(answer);
    }
    public static int find(ArrayList<Integer> list, int a){
        int out = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == a){
                out = 1;
                break;
            }
        }
        return out;
    }
}
