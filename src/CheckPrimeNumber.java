public class CheckPrimeNumber {
    public static void main(String[] args){
        int x = 137;
        int counter = 0;
        for (int i=2; i<x; i++){
            if(x%i == 0){
                counter++;
            }
        }
        if(counter > 0){
            System.out.println(x+" : is not a prime number.");
        }else{
            System.out.println(x+" : is a prime number.");
        }

    }
}
