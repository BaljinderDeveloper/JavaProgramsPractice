package Stack;

import java.util.LinkedList;

public class Stack {
    int top = 0;
    LinkedList<Integer> arr = new LinkedList<>();
    public void push(int data){
        arr.add(data);
        top++;
    }
    public String show(){
        return arr.toString();
    }
    public int pop(){
        top--;
        int toPop = arr.get(top);
        arr.remove(top);
        return toPop;
    }
}
