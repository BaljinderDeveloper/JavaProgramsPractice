import java.util.ArrayList;
import java.util.List;

public class ListNumCheckOdd {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(32);
        list.add(323);
        list.add(3225);
        list.add(3221);
        list.add(3222);
        list.add(3258);
        list.add(3258);

        int odd = 0;
        int even = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of odd values:"+odd);
        System.out.println("Number of even values:"+even);
    }
}
