package Queue;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    List<Integer> list = new LinkedList<>();
    public void push(int data){
        list.add(data);
    }
    public String show(){
        return list.toString();
    }
    public int pop(){
        int toPop = list.getFirst();
        list.removeFirst();
        return toPop;
    }
}
