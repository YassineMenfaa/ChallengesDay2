import java.util.Scanner;

public class VowelChecker {

    public void consonantChecker(){

        Scanner input = new Scanner(System.in);

        System.out.println("Saisie un caracter : ");
//        input.next();

        char letter = input.next().charAt(0);
        char lower = Character.toLowerCase(letter);

        switch(lower){
            case 'a':
                System.out.println(letter + "  est une voyelle.");
                break;
            case 'e':
                System.out.println(letter + " est une voyelle.");
                break;
            case 'i':
                System.out.println(letter + " est une voyelle.");
                break;
            case 'o':
                System.out.println(letter + " est une voyelle.");
                break;
            case 'u':
                System.out.println(letter + " est une voyelle.");
                break;
            default:
                System.out.println(letter + " est une consonne.");
        }
        //input.close();
    }
}
