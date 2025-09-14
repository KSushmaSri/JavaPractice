import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int search;
        System.out.println("Enter a number to search:");
        search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<a.length;i++){
        if(search==a[i]){
            System.out.println("It is present at index: "+i);
            found=true;
        }
    }
    if(!found){
        System.out.println("Element not found");
    }
       
    }
}
