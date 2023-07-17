import java.util.Scanner;

class Io {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        int lineNumber = 1;
        while (scanner.hasNext()) {
            String token = scanner.nextLine();
            System.out.println(lineNumber+ " " + token);
            lineNumber++;
        }

        scanner.close();
    }
}