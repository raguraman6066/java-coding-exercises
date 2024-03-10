import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number: ");
       int number= scanner.nextInt();
       //algorithm to display prime
String primeNum="";
        for(int i=1;i<=number;i++){
            int count=0;
            for(int num=i;num>=1;num--){
                if(i%num==0){
                    count++;
                }
            }
            if(count==2){
                primeNum=primeNum+i+" ";
            }

        }
        System.out.println(primeNum);

    }
}
