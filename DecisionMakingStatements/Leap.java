import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("Leap Year");
        }
        else if (year%100==0) {
            System.out.println("not a leap year");
        }
        else if(year%4==0){
            System.out.println("leap year");
        } 
        else {
            System.out.println("not a leap year");
        }
    }
}
