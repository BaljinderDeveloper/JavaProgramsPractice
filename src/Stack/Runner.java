package Stack;

public class Runner {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(22);
        obj.push(33);
        System.out.println(obj.show());
        obj.push(98);
        obj.push(98);
        obj.push(99);
        obj.push(100);
        obj.push(101);
        System.out.println(obj.show());

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.show());
    }
}