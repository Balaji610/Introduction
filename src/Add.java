import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a value ");
        int a= sc.nextInt();        
        System.out.println("enter the b value ");
        int b= sc.nextInt();
        System.out.println("the total is =" +(a+b));
        System.out.println("the total is =" +(a-b));
        System.out.println("the total is =" +(a/b));
        System.out.println("the total is =" +(a*b));
        System.out.println("the total is =" +(a%b));
        System.out.println(" enter the value a of string=");
        String a=sc.nextLine();
        System.out.println(" enter the value b of string=");
        String b=sc.nextLine();
        System.out.println("the string concordination is ="+a+" "+b);

    }
}
