import java.util.Scanner;

public class Hello {
        String line;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        line = scanner.nextLine();
        System.out.println("Hello " + line);
    }
}
