package ICP1.Day_06_03_October;

public class Q01_LC_79_WordSearch {
    public static void main(String[] args) {
        char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        System.out.println(Search(board,word));
    }
    public static boolean Search(char board[][],String word ){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = match(board,word,i,j,0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean match(char board[][],String word,int cr,int cc,int ind){
        if(ind == word.length()){
            return true;
        }
        if(cr >= board.length || cr < 0 || cc >= board[0].length || cc < 0 || board[cr][cc] != word.charAt(ind)){
            return false;
        }
        board[cr][cc] = '*';
        int r[] = {-1,0,1,0};
        int c[] = {0,-1,0,1};
        for(int i=0;i<r.length;i++){
            boolean ans = match(board, word, cr+r[i], cc+c[i], ind+1);
            if(ans){
                return true;
            }
        }

        board[cr][cc] = word.charAt(ind);
        return false;
    }
}
