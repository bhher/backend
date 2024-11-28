package a1128.sort;

public class Compare1 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        System.out.println(str1.compareTo(str2)); //음수(-1)
        //'a' 아스키코드(97) b(98) 
        System.out.println(str1.compareTo(str3)); //0 두문자열이 같은면 0
        System.out.println(str2.compareTo(str1)); //양수 b(98) a(97) ->양수 +1

    }
}
