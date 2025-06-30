import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the first parameter:");
        int firstParam = input.nextInt();

        System.out.println("Enter the second parameter:");
        int secondParam = input.nextInt();

        try {
            count(firstParam, secondParam);
        } catch (InvalidParameterException exception) {
            System.out.println(exception.getMessage());
        }

        input.close();
    }

    static void count(int firstParam, int secondParam) throws InvalidParameterException {
        if (firstParam > secondParam) {
            throw new InvalidParameterException("The second parameter must be greater than the first.");
        }

        int range = secondParam - firstParam;

        for (int i = 1; i <= range; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}