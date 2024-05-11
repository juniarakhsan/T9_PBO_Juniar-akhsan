import java.util.Scanner;

public class ReadStringInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String nama = input.nextLine();
            System.out.println("Hello, " + nama);
        }
    }
}
