import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Strictly, Enter "+n+" elements:");
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
        int sum=0;
        double avg;           //double is used to take the decimal values also
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of Array:"+sum);
        avg=(double)sum/a.length;
        System.out.println("Average:"+avg);
        sc.close();
    }

}
