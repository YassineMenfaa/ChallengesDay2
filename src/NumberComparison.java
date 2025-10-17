import java.util.Scanner;

public class NumberComparison {

    public void Comparison(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number to compare :");
        double num1 = input.nextDouble();

        System.out.println("Enter the 2nd number to compare :");
        double num2 = input.nextDouble();

        if( num1 == num2 ){
            System.out.println(num1 + " is equal of number 2 ");
        } else if( num1 < num2 ){
            System.out.println(num1 + " Less than the second number : " + num2);
        } else {
            System.out.println(num1 + " Greater than the second number : " + num2);
        }
        input.close();
    }

}
