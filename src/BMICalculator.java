import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("Enter your weight");
        Scanner scanner=new Scanner(System.in);
        float weight=scanner.nextFloat();
        System.out.println("Enter your height");
        float height=scanner.nextFloat();
        float bmi=weight/(height*height);
        System.out.println("Your BMI "+bmi);
    }
}
