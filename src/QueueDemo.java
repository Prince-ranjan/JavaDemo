import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Queue follow FIFO
        queue.add(12);
        queue.add(27);
        queue.add(11);
        queue.add(7);

        Stack<Integer> stack  = new Stack<>();
        stack.add(12);
        stack.add(27);
        stack.add(11);
        stack.add(7);
//        while (queue.isEmpty() == false) {
//            System.out.println(queue.poll());
//        }

        System.out.println(queue.peek()); //12
        System.out.println(stack.peek()); //7

        String string = "Hello Everyone"; //

        Stack<Character> characterStack = new Stack<>();

        for(char c : string.toCharArray()) {
            characterStack.push((Character) c);
        }


        while (!characterStack.empty()) {
            System.out.print(characterStack.peek());
            characterStack.pop();
        }
    }
}
