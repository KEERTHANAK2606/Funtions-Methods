import java.util.*;
public class ReverseInMethod{
    static int reverseNumber(int n){
        int rev=0;
        while(n!=0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    return rev;
}
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.print(reverseNumber(n));
}
}
