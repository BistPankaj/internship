import java.util.Scanner;

public class Task2{
    public static void main(String [] args){
        /*Implementing s program that check whether a given word or pharse is a  palindrome*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String strg){
        String newstr = strg.replaceAll("[^a-z A-Z]","").toLowerCase();
        int len = newstr.length();
        for(int i=0;i<len/2;i++){
            if(newstr.charAt(i) != newstr.charAt(len-i-1)){
                return false;
            }
        }
        return true;
       
    }
    
}