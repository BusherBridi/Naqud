import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu mainMenu = new Menu("Main Menu", 3);
        mainMenu.set_menuButtonTitle(0, "Set up");
        mainMenu.set_menuButtonTitle(1, "Input");
        mainMenu.set_menuButtonTitle(2, "View");

        Portfolio myPortfolio = new Portfolio("Test", "memo", 6000);
        myPortfolio.addTransaction("rent", -1800, "Rent money");
        myPortfolio.addTransaction("Groceries", -200, "gotta eat");
        myPortfolio.addTransaction("Investments", -500, "workday.inc");
        myPortfolio.addRecurringTransaction("Debt", -100, "memo", 1);
        System.out.printf("total expense: %f\n", myPortfolio.calculateFutureBalance(4));

        // PrettyTable table = new PrettyTable("Firstname", "Lastname", "Email",
        // "Phone");
        // table.addRow("John", "Doe", "johndoe@nothing.com", "+2137999999");
        // table.addRow("Jane", "Doe", "janedoe@nothin.com", "+2137999999");
        // System.out.println(table);

        // myPortfolio.print();
        // mainMenu.print();
        // Menu Logic:
        // int userSelection = sc.nextInt();
        // switch (userSelection) {
        // case 1:
        // System.out.println("Set up");
        // Portfolio myPortfolio = Portfolio.userSetup(sc);
        // myPortfolio.print();
        // break;
        // case 2:
        // System.out.println("Input");
        // break;
        // case 3:
        // System.out.println("View");
        // break;
        // case 0:
        // System.out.println("Exit");
        // break;
        // default:
        // System.out.println("Invalid Choice");
        // }
        sc.close();
    }

}
