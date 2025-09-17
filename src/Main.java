import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean Exit;
        int x;
        int y;
        Exit = false;
        System.out.println("Welcome to Crappy Calculator");
        while(Exit == false) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number");
            if(input.hasNextInt()) {
                x = input.nextInt();
            }
            else {
                System.out.println("not a number");
                continue;
            }
            System.out.println("Please enter a second number");
            if(input.hasNextInt()) {
                 y = input.nextInt();
            }
            else {
                System.out.println("not a number");
                continue;
            }
            System.out.println("Please enter calculation");
            String command = input.next();
            switch (command){
                case "add":
                    new commands().add(x, y);
                    continue;
                case "sub":
                    new commands().sub(x, y);
                    continue;
                case "mul":
                    new commands().mul(x, y);
                    continue;
                case "div":
                    new commands().div(x, y);
                    continue;
                case "remainder":
                    new commands().remainder(x, y);
                    continue;
                case "exit":
                    Exit = true;
                    continue;
                    default:
                        System.out.println("Invalid command");
                        continue;
            }
        }
    }
}
