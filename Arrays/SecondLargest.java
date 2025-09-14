import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        if (n < 2) {
            System.out.println("Array must have at least 2 elements!");
            return;
        }
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i =0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
        if(a[i]>first){
            second=first;
            first=a[i];
        }
        else if(a[i]>second && a[i]!=first){
            second=a[i];
        }
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("No second largest (may be all are same values)");
        }
        else{
        System.out.println("Second Largest Number is:"+second);
        }
        }
    }

