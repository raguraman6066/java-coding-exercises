import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number: ");
       int num1= scanner.nextInt();
        System.out.println("enter second number: ");
       int num2= scanner.nextInt();

       if(num1>num2){
           System.out.println("number 1 is bigger");
       }else if(num2>num1){
           System.out.println("number 2 is bigger");
       }else{
           System.out.println("both are equal");
       }

    }
}
