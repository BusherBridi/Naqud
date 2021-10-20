import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main Menu", 3);
        mainMenu.set_menuButtonTitle(0, "Set up");
        mainMenu.set_menuButtonTitle(1, "Input");
        mainMenu.set_menuButtonTitle(2, "View");
        int userSelection = mainMenu.printAndReturnInput();
        // Menu Logic:
        switch (userSelection) {
            case 1:
                System.out.println("Set up");
                String name;
                String description;
                float netPay;
                Scanner setupScanner = new Scanner(System.in);
                name = setupScanner.nextLine();
                break;
            case 2:
                System.out.println("Input");
                break;
            case 3:
                System.out.println("View");
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
