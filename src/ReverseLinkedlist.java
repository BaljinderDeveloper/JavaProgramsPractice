import java.util.LinkedList;

public class ReverseLinkedlist {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for(int i = 0; i<list.size(); i++){
            //System.out.println(list.get(i));
            list2.add(i,list.get(list.size()-1-i));
        }
        System.out.println(list2);
    }
}
