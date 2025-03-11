public class Factorial {
    public static void main(String[] args){
        int x = 5;
        System.out.println("factorial of "+x+" is : "+fact(x));
    }
    public static int fact(int num){
        if(num == 0 || num == 1)
            return 1;
        else
            return num * fact(num-1);
    }
}
