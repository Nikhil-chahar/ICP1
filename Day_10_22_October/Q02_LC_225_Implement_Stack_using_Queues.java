package ICP1.Day_10_22_October;

import java.util.LinkedList;
import java.util.Queue;

public class Q02_LC_225_Implement_Stack_using_Queues {
    class MyStack {
        public Queue<Integer> q;
        public MyStack() {
            q = new LinkedList<>();
        }
        
        public void push(int x) {
            q.add(x);
            for(int i = 0; i<q.size()-1; i++){
                q.add(q.poll());
            }
        }
        
        public int pop() {
            return q.poll();
        }
        
        public int top() {
            return q.peek();
        }
        
        public boolean empty() {
            return q.isEmpty();
        }
    }
}
