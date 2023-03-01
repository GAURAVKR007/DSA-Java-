import java.util.*;
public class StackCollection {

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);    // Recursion
        s.push(top);

    } 

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        // pushAtBottom(4, s1);

        reverseStack(s1);


        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
