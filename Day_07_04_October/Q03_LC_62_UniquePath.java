package ICP1.Day_07_04_October;

public class Q03_LC_62_UniquePath {
    public static void main(String[] args) {
        int n=3,m=7;

        System.out.println(path(n,m));
    }
    public static int path(int n,int m){

        int dp[][] = new int[n][m];

        for(int i=0;i<n;i++) dp[i][0] = 1;
        for(int j=0;j<m;j++) dp[0][j] = 1;

        for(int i=1;i<n;i++){
            for(int j =1;j<m;j++){
                dp[i][j] = dp[i-1][j] + d[i][j-1];
            }
        }
        return dp[n-1][m-1];


    }
    
}
