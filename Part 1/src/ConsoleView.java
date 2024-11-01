import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayData(String data){
        System.out.println("Current data: " + data);
    }

    public String getInput(String input){
        System.out.println(input);
        return scanner.nextLine();
    }

    public void displayFinalData(String data){
        System.out.println("Combined  data: " + data);
    }
}
