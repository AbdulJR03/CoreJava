package BasicPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String string =  "abdul" , revstr = "";

        char ch;

        for (int i=0 ; i < string.length(); i++){

            ch = string.charAt(i);
            revstr = ch + revstr ;
        }
        System.out.println(revstr);
//
//        if(string.equalsIgnoreCase(revstr)){
//
//            System.out.println("String is palindrome");
//        }
//        else {
//            System.out.println("String is not palindrome");
//        }
    }

}
