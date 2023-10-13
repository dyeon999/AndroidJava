public class safe {
    public static void main(String[] args) {
        int[][] board = new int[5][5];
        board[3][2] = 1;
        board[3][3] = 1;
        int answer = 0;
        int[][] bomboard = new int[board.length][board.length];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == 1)
                    check(bomboard, i, j);
            }
        }
        answer = count(bomboard);
        System.out.println(answer);
    }

    public static void check(int[][] bomb, int x, int y){
        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        int nx;
        int ny;
        for (int i = 0; i < 9; i++){
            nx = x + dx[i];
            ny = y + dy[i];
            if (nx < bomb.length && ny < bomb.length){
                if (nx > -1 && ny > -1)
                    bomb[nx][ny] = 1;
            }
        }
    }
    
    public static int count(int[][] bomb){
        int cnt = 0;
        for (int i = 0; i < bomb.length; i++){
            for (int j = 0; j < bomb.length; j++){
                if (bomb[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }
}
