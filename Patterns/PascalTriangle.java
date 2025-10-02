import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //SPACES
            // for(int j=1;j<=n-i;j++){
            //     System.out.print(" ");
            // }
            int val=1;
            for(int j=1;j<=i;j++){
                System.out.print(+val+" ");
                val=val*(i-j)/j;
            }
            System.out.println();
        }
        sc.close();
    }
}
