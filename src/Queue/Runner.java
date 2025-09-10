package Queue;

public class Runner {
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.push(13);
        obj.push(19);
        obj.push(34);
        System.out.println(obj.show());
        obj.push(49);
        obj.push(93);
        System.out.println(obj.show());

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.show());
    }
}