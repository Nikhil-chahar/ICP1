package ICP1.Day_01_13_Jan_2026;

import java.util.*;

public class Next_Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nextPrime(n));
    }

    public static int nextPrime(int n) {
        int num = n + 1;

        while (true) {
            boolean isPrime = true;

            if (num < 2) {
                num++;
                continue;
            }

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                return num;
            }
            num++;
        }
    }
}
