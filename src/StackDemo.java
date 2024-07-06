import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.empty());

        //stack.peek();

        stack.push(20);
        stack.push(25);
        stack.push(21);
        stack.push(27);


        while (stack.empty() ==  false){
            System.out.println(stack.pop());
        }


//        System.out.println(stack.empty());
//
//        System.out.println(stack.peek());
//
//        stack.pop();
//
//        System.out.println(stack.peek());
//
//        stack.push(35);  // 35 21  25 20
//
//        System.out.println(stack.peek());
//
//        System.out.println(stack.search(20));
    }


}
