import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //REVERSE USING LOOPS
        System.out.println("Array in Reverse order using loop is ");
        for(int j=n-1;j>=0;j--){
            System.out.print(a[j]+" ");
            
        }
        System.out.println("");
        //REVERSE USING SWAP
        int start=0 , end=n-1;
        if(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("Array in Reverse order using swap is ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
