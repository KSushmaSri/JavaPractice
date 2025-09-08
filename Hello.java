import java.util.Scanner;
class Hello{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter you age:");
        int age=sc.nextInt();
        System.out.println("Check your details");
        System.out.println("Name is "+name+ "\nAge is "+age);
        sc.close();
    }
}