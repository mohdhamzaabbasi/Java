import java.util.Scanner;
public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();
        Integer integerValue = Integer.valueOf(intValue);

        System.out.print("Enter a character value: ");
        char charValue = scanner.next().charAt(0);
        Character characterValue = Character.valueOf(charValue);

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        Double doubleObject = Double.valueOf(doubleValue);

        System.out.println("Primitive Integer Value: " + intValue);
        System.out.println("Integer Object: " + integerValue);

        System.out.println("Primitive Character Value: " + charValue);
        System.out.println("Character Object: " + characterValue);

        System.out.println("Primitive Double Value: " + doubleValue);
        System.out.println("Double Object: " + doubleObject);

        scanner.close();
    }
}
