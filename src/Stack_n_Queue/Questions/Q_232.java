package Stack_n_Queue.Questions;

import Stack_n_Queue.Stack_Expection;

import java.util.Stack;

public class Q_232 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.pop());
    }
}
class QueueUsingStack{
    private  Stack<Integer> first ;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public  void insert(int item){
        first.push(item);
    }
    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}