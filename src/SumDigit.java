import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter  a number to sum its digits: ");
        int number=scanner.nextInt();
        //27=20+7=2+7


        int sum=0;
        while(number!=0){
            sum=sum+number%10;//get last digit and add to sum
            System.out.println(sum);
            number=number/10;//remove last number

        }
        System.out.println(sum);
    }
}
