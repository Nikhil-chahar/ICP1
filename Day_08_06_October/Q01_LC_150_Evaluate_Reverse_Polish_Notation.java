// package ICP1.Day_08_06_October;

// import java.util.Stack;
// import java.util.*;

// public class Q01_LC_150_Evaluate_Reverse_Polish_Notation {
//     public static void main(String[] args) {
//         String tokens[] = {"2","1","+","3","*"};
//         int val =evalRPN(tokens);
//         System.out.println(val);
//     }
//     public static int evalRPN(String[] tokens) {
//         Stack<Integer> st = new Stack<>();

//         for (String token : tokens) {
//             if (isNumeric(token)) {
//                 st.push(Integer.parseInt(token));
//             } else {
//                 int b = st.pop();
//                 int a = st.pop();
//                 int ans = applyOp(token, a, b);
//                 st.push(ans);
//             }
//         }

//         return st.peek();
//     }

//     public static int applyOp(String op, int a, int b) {
//         switch (op) {
//             case "+": return a + b;
//             case "-": return a - b;
//             case "*": return a * b;
//             case "/": return a / b; // assume integer division
//             default: throw new IllegalArgumentException("Invalid operator: " + op);
//         }
//     }

//     private boolean isNumeric(String str) {
//         if (str == null || str.isEmpty()) return false;
//         // allow optional leading '-'
//         if (str.charAt(0) == '-' && str.length() > 1) {
//             str = str.substring(1);
//         }
//         for (char c : str.toCharArray()) {
//             if (!Character.isDigit(c)) return false;
//         }
//         return true;
//     }
// }
