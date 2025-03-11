public class FibonacciUsingRecursion {
    public static void main(String[] args){
        int length = 5;
        for(int i=0; i<=length; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int a){
        if(a <= 1)
            return a;
        else
            return fibonacci(a-1) + fibonacci(a-2);
    }
}
