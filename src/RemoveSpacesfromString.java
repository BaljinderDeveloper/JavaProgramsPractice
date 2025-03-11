public class RemoveSpacesfromString {
    public static void main(String[] args){
        String str = "My name is Vicky";
        String newStr = "";
//        char ch = ' ';
//        System.out.println((int)ch);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 32){
                continue;
            }else{
                newStr = newStr+str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}

//str.trim();
//str.strip();
