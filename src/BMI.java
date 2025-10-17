import java.util.Scanner;

public class BMI {

    public void BmiCategorize(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight (in kilograms) :");
        double weight = input.nextDouble();

        System.out.println("Enter your height (in meters) :");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
//        System.out.println("Votre BMI est :"+ bmi);

        if( bmi < 18.5 ){
            System.out.println("Category : Underweight");
        } else if ( bmi >= 18.5 && bmi <= 24.9 ) {
            System.out.println("Category : Normal weight");
        } else if ( bmi >= 25 && bmi <=29.9){
            System.out.println("Category : Overweight");
        } else if ( bmi >= 30) {
            System.out.println("Category : Obese");
        } else {
            System.out.println("Category : Invalid BMI");
        }
//        input.close();
    }

}
