package ICP1.Day_08_06_October;

import java.util.Stack;

public class Q03_LC_71_Simplify_Path {
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
       String ans = simplifyPath(path);
       System.out.println(ans);
    }
    public static String simplifyPath(String path) {
        String s[] = path.split("/");
        Stack<String> st = new Stack<>();

        for(String str : s){
            if(str.equals("") || str.equals(".")){
                continue;
            }
            if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.insert(0,"/"+st.pop());
        }

        if(sb.length() == 0){
            return "/";
        }
        return sb.toString();
    }
}