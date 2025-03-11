import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CheckTwoArrayTreeSet {
    public static void main(String[] args) {
        //int arr1 = 10;
        int[] arrr1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,8,2,31};
        int[] arrr2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,9,9};

        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        TreeSet<Integer> ts2 = new TreeSet<Integer>();

        for(int i=0; i<arrr1.length; i++){
            ts1.add(arrr1[i]);
        }
        for(int i=0; i<arrr2.length; i++){
            ts2.add(arrr2[i]);
        }

        System.out.println("TreeSet 1:"+ts1);
        System.out.println("TreeSet 2:"+ts2);

        if(ts1.size() != ts2.size()) {
            System.out.println("Both arrays are different");
            System.exit(-1);
        }else{
            System.out.println("Both arrays are same");
        }

        ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
        Iterator<Integer> it = ts1.iterator();
        while(it.hasNext()){
            arrlist1.add(it.next());
        }
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>();
        Iterator<Integer> it2 = ts2.iterator();
        while(it2.hasNext()){
            arrlist2.add(it2.next());
        }
        System.out.println("Array list 1:"+arrlist1);
        System.out.println("Array list 2:"+arrlist2);

        //comparing
        int counter = 0;
        for(int i = 0; i<arrlist2.size(); i++){
            if(arrlist1.get(i) == arrlist2.get(i))
                counter++;
                
        }
        if(counter > 0)
            System.out.println("Arrays are similar");
        else
            System.out.println("Arrays are differ");
    }
}
