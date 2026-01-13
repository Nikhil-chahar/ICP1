package ICP1.Day_01_13_Jan_2026;
import java.util.*;
public class Count_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPrimes(n));

    }
    public static int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        boolean isPrime[] = new boolean[n];
        int cnt = 0;
        Arrays.fill(isPrime,true);

        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j < n;j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(isPrime[i]) cnt++;
        }
        return cnt;
    }
}
