import java.lang.runtime.SwitchBootstraps;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class TicketPriceCalculator {


    public void TickerPrice(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you Age : ");
        int age = input.nextInt();

        if ( age <= 12 ){
            System.out.println("Your ticket price : 5$");
        } else if ( age <= 17 ) {
            System.out.println("Your ticket price : 8$");
        } else {
            System.out.println("Do you have a student ID? (yes/no): ");
            String response = input.next().toLowerCase();


            if (response.equals("yes")){
                System.out.println("Your ticket price : 10$");
            } else if (response.equals("no")){
                System.out.println("Your ticket price : 15$");
            }

        }

    }

}
