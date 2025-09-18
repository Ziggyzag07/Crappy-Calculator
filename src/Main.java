import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean Exit = false;
        Integer oldresult = null;


        Numbers numbers = null;
        commands result = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Crappy Calculator");
        while (!Exit) {
            numbers = GetNumberValue(oldresult, numbers, input);
            result = GetCommand(result, numbers, input);
            System.out.println("the result was " +result.getResult() +"\n" + "do you wish to reset(c), exit(exit), or calculate with result(calculate)");
            input.nextLine();
            String command = input.nextLine();
            switch (command) {
                case "exit": {
                    Exit = true;
                    System.out.println("exiting");
                    break;
                }
                case "calculate": {
                    oldresult = result.getResult();
                    numbers = null;
                    result = null;
                    break;

                }
                case "c": {
                    System.out.println("Reseting");
                    numbers = null;
                    result = null;
                    break;
                }
                default: {
                    System.out.println("invalid command");
                }
            }
        }
    }
        private static commands GetCommand(commands result, Numbers numbers, Scanner input) {
        int z;
            while(result == null) {
                System.out.println("Please enter calculation");
                String command = input.next();
                switch (command){
                    case "add":
                         z = commands.add(numbers.getX(), numbers.getY());
                        result = new commands(z);
                        continue;
                    case "sub":
                        z = commands.sub(numbers.getX(), numbers.getY());
                        result = new commands(z);
                        continue;
                    case "mul":
                        z = commands.mul(numbers.getX(), numbers.getY());
                        result = new commands(z);
                        continue;
                    case "div":
                        z = commands.div(numbers.getX(), numbers.getY());
                        result = new commands(z);
                        continue;
                    case "remainder":
                        z = commands.remainder(numbers.getX(), numbers.getY());
                        result = new commands(z);
                        continue;
                    default:
                        System.out.println("Invalid command");
                }
            }
            return result;
        }

        private static Numbers GetNumberValue(Integer oldresult, Numbers numbers, Scanner input) {

            Integer x = null;
            Integer y = null;
            if(oldresult != null) {
                x = oldresult;
            }
            while (numbers == null) {
                System.out.println("Please enter a number");
                if (input.hasNextInt() && x == null) {
                     x = input.nextInt();

                }
                else if (input.hasNextInt() && y == null) {
                    y = input.nextInt();
                    numbers = new Numbers(x, y);

                }
                else {
                    System.out.println("Not a number ");
                    input.nextLine();

                }


            }
            return numbers;
    }
}
