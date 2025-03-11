public class PallindromeString {
    public static void main(String[] args){
        String str = "Vickykciv";

        int counter = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                counter++;
                break;
            }
        }
        if(counter == 0)
            System.out.println("String is a pallindrome");
        else
            System.out.println("String is not a pallindrome");
    }
}
