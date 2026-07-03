import java.util.*;
public class PalindromeInMethod {
    static int reverse(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }
    static void checkPalindrome(int num){
        if(num==reverse(num)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        checkPalindrome(num);
    }
}
