import java.util.*;
public class palindrome{
    public static String palindrome(String str,String rev){
        for (int i = str.length()-1;i>=0;i--){
            rev +=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    return rev;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        String rev = "";
        String result = palindrome(str,rev);
        System.out.println("the reversed string is " + result); 
    }
}