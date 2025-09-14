import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int j=0;j<n;j++){
            num[j]=sc.nextInt();
        }
        int max=num[0];
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+min);
        sc.close();
    }
}
