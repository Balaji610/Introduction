import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number =");
        a = sc.nextInt();
        System.out.println("enter the second number =");
        b = sc.nextInt();
        c = a + b;
        System.out.println("the total is =" + c);
    }
}

