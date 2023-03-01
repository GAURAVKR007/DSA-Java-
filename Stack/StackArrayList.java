import java.util.ArrayList;

import javax.xml.namespace.QName;

public class StackArrayList {

    static class ArrStack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            if(list.size()>0){
                return false;
            }
            return true;
        }

        public static void push(int data) {
            list.add(data);
        } 

        public static int pop() {
            if(isEmpty()){
                return -1;
            }

            int top = list.get(list.size() -1);
            list.remove(list.size() -1);
            return top;
        }

        public static int peek() {
            if(isEmpty()){
                return -1;
            }

            int top = list.get(list.size() -1);
            return top;
        }
    }


    public static void main(String[] args) {
        ArrStack s1 = new ArrStack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
