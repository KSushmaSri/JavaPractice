import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k ");
        int k =sc.nextInt();
        k = k % n;
        for (int r=0;r<k;r++){
            int first=arr[0];
            for (int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=first;
        }
        System.out.println("Rotated elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
