package ICP1.Day_01_13_Jan_2026;

import java.util.Scanner;

public class Find_the_first_Occurance_in_the_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hay = sc.next();
        String needle = sc.next();

        System.out.println(strStr(hay,needle));
    }
   public static int strStr(String hay, String needle) {
        int n = hay.length();
        int m = needle.length();

        for(int i = 0;i<=n-m;i++){
            String s = hay.substring(i,i+m);

            if(needle.equals(s)){
                return i;
            }
        }
        return -1;
        // return hay.indexOf(needle);  //-> answer as one liner
    }
}