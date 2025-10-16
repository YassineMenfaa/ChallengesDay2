import java.util.Scanner;

    public class PositiveChecker {

        public void PosChecker(){

        Scanner input = new Scanner(System.in);

        System.out.println("Entrez un numero (Positive/Negative) :");
        double num = input.nextDouble();

        if ( num == 0 ){
            System.out.println("The number is Zero");
        } else if ( num > 0 ) {
            System.out.println("The number is Positive");
        } else {
            System.out.println("The number is Negative");
        }
        input.close();
    }

}
