import java.util.Stack;

public class PostfixExpression {

     public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens){
            if(s.equals("+")){
                stack.add(stack.pop() + stack.pop());
                continue;
            }

            if(s.equals("-")){
                int less = stack.pop();
                int top = stack.pop();
                stack.add(top - less);
                continue;
            }

            if(s.equals("*")){
                stack.add(stack.pop() * stack.pop());
                continue;
            }

            if(s.equals("/")){
                int less = stack.pop();
                int top = stack.pop();
                stack.add(top / less);
                continue;
            }

            stack.add(Integer.parseInt(s));
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] token = {"4","3","-"};

        System.out.println(evalRPN(token));
    }
}
