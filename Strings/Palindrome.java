import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word:");
        String s=sc.nextLine();
        String rev="";
        for(int i =s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if (rev.equals(s)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
