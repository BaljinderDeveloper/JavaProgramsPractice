import java.util.ArrayList;

public class SortArray {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(21);
        arr.add(41);
        arr.add(26);
        arr.add(82);
        arr.add(45);
        arr.add(8);
        arr.add(100);
        arr.add(80);
        arr.add(8);
        arr.add(-4);
        arr.add(0);

        int temp ;
        for(int i=0; i<arr.size(); i++){
            for(int j = i+1; j<arr.size(); j++){
                if(arr.get(i)<arr.get(j)){      //Descending
                //if(arr.get(i)>arr.get(j)){  //Ascending
                    temp= arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
        System.out.println(arr);
    }
}
