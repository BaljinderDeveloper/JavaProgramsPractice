import java.util.TreeSet;

public class CheckTwoArraysSame {
    public static void main(String[] args){
        //int arr1 = 10;
        int[] arrr1 = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] arrr2 = new int[]{0,1,2,3,4,5,6,7,8,90};

        int count=0;
        for(int i=0; i<arrr1.length; i++){
                if(arrr1[i] != arrr2[i]){
                    count++;
                    break;
                }
        }
        if(count > 0)
            System.out.println("Both arrays are different");
        else
            System.out.println("Both arrays are same");

    }
}
