public class ReverseString {
    public static void main(String[] args) {
        String str= "abcba";
        String result = "";
        Character ch = null;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            result = ch + result;
        }

        System.out.println(result.equals(str));
    }
}