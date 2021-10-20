import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu mainMenu = new Menu("Main Menu", 3);
        mainMenu.set_menuButtonTitle(0, "Set up");
        mainMenu.set_menuButtonTitle(1, "Input");
        mainMenu.set_menuButtonTitle(2, "View");
        mainMenu.print();
        // Menu Logic:
        int userSelection = sc.nextInt();
        switch (userSelection) {
        case 1:
            System.out.println("Set up");
            Portfolio myPortfolio = Portfolio.userSetup();
            myPortfolio.print();
            break;
        case 2:
            System.out.println("Input");
            Transaction myTrans = new Transaction("test", 12,"test");
            System.out.println(myTrans.get_name());
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
        sc.close();
    }

}
