import java.util.HashMap;
import java.util.TreeSet;

public class CharOccuranceString {
    public static void main(String[] strings){
        String str = "Gandalf";
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int j = 0; j<str.length(); j++){
            int count = 0;
            char ch = str.charAt(j);
            for(int i =0; i<str.length(); i++){
                if(str.charAt(i) == ch)
                    count++;
            }
            hm.put(str.charAt(j),count);
        }
        System.out.println(hm);
    }
}
