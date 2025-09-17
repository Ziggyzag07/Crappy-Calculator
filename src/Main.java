import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean Exit;
        Exit = false;
        System.out.println("Welcome to Crappy Calculator");
        while(Exit == false) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number");
            int x = input.nextInt();
            System.out.println("Please enter a second number");
            int y = input.nextInt();
            System.out.println("Please enter calculation");
            String command = input.next();
            switch (command){
                case "add":
                    new commands().add(x, y);
                    continue;
                case "sub":
                    new commands().sub(x, y);
                    continue;

            }


            else if(command.equals("exit")){
                Exit = true;
                continue;
            }
        }


    }
}