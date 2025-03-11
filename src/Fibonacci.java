public class Fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int result = 0 ;
        for(int i = 0; i <=10; i++){
            result = a + b;
            a = b;
            b = result;
            System.out.println(result);
        }
    }
}
