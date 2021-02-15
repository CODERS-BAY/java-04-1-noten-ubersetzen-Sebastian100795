import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int note = scanner.nextInt();

        switch (note) {
            case 1:
                System.out.println("Sehr Gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht Genügend");
                break;
            default:
                System.out.println("Das ist keine Gültige eingabe.");
                break;
        }
    }
}
