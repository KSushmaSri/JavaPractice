import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int evenCount=0;
        int oddCount=0;
        System.out.print("Enter "+n+ " elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("EvenCount is "+evenCount);
        System.out.println("OddCount is "+oddCount);
        sc.close();
    }
}
