public class CheckVowelInString {
    public static void main(String[] args){
        String str = "Baljinder";
        int counter = 0;
        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
               str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                counter++;
            }
        }
        System.out.println("Number of vowels = "+counter);
    }
}
