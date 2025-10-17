import java.util.Scanner;

public class MonthDays {

    public void Daysinmonth(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month : ");
        int month = input.nextInt();

        switch(month){
            case 1:
                System.out.println(" This month has 31 days.");
                break;
            case 3:
                System.out.println(" This month has 31 days.");
                break;
            case 5:
                System.out.println(" This month has 31 days.");
                break;
            case 7:
                System.out.println(" This month has 31 days.");
                break;
            case 8:
                System.out.println(" This month has 31 days.");
                break;
            case 10:
                System.out.println(" This month has 31 days.");
                break;
            case 12:
                System.out.println(" This month has 31 days.");
                break;
            case 4:
                System.out.println("This month has 30 days");
                break;
            case 6:
                System.out.println("This month has 30 days");
                break;
            case 9:
                System.out.println("This month has days");
                break;
            case 11:
                    System.out.println("This month has days");
                    break;
            case 2:
                System.out.println("This month has 28 or 29 days (February)");
                break;
            default:
                System.out.println("Number of month is invalid");
        }
//        input.close();
    }
}
