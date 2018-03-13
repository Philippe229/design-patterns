import composite.Component;
import composite.Composite;
import composite.Leaf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Choose a design pattern: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try {
            int selection = Integer.parseInt(input);
            System.out.println("Input is: " + selection);

            switch (selection) {
                case 1:
                    composite();
                    break;
                default:
                    System.out.println("Number does not specify any design pattern.");
            }

            System.out.println("End of program.");
        } catch(NumberFormatException e) {
            System.out.println("Not a number!");
            System.exit(0);
        }
    }

    private static void composite() {
        Leaf leaf = new Leaf();
        Composite composite = new Composite();
        composite.add(leaf);

        ((Component)leaf).operation();
        ((Component)composite).operation();
    }

}
