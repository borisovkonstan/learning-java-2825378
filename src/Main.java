import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeatime() {
        System.out.println("Waitong for tea time....");
        System.out.println("Type rundom word and press enter!");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("It's developer tea time....");
    }

    public static void main(String[] args) {
        announceDeveloperTeatime();

    }

}
