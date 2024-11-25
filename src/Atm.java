import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        int bal=1000000,dep,withdraw,pin=1235;
        System.out.println("enter the pin num");
        Scanner sc=new Scanner(System.in);
        pin=sc.nextInt();
        if(pin==1235){
            System.out.println("welcome to Canara bank Atm");
            System.out.println("1.click for money withdrawl");
            System.out.println("2.click for money you want to deposit");
            System.out.println("3.click for to enquiry bank balance ");
            System.out.println("4.click for get back");
          int n=sc.nextInt();
          switch (n)
          {
              case 1:
                  System.out.println("to check balance = "+bal);
                  break;
              case 2:
                  System.out.println("enter money withdrawl");
                   withdraw=sc.nextInt();
                  if(withdraw>=bal) {
                      System.out.println("sorry insufficiant balance");
                  }
                      else
                      {
                          bal=bal-withdraw;
                          System.out.println("you withdrawed="+bal);
                      }

          break;

              case 3:
                  System.out.println("enter amt you want to deposit");
                   dep=sc.nextInt();
                  bal=bal+dep;
                  break;

              case 4:
                  System.out.println("thank use again");
break;


          }
        }
        else{

            System.out.println("you enteered wrong pin");
        }

            System.out.println("do you want to continue");
        int a=sc.nextInt();
        for( int i=0;i<a;i++){


        }
    }
}
