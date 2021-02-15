import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int note = scanner.nextInt();

        switch (note) {
            case 1:
                System.out.println("Sehr Gut");
            case 2:
                System.out.println("Gut");
            case 3:
                System.out.println("Befriedigend");
            case 4:
                System.out.println("Genügend");
            case 5:
                System.out.println("Nicht Genügend");
        }
    }
}
