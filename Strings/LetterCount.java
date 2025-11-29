import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        String s=sc.nextLine();
        System.out.println("Enter the character to check the repetition:");
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Repetiton count of "+c+" :"+count);
    }
}
