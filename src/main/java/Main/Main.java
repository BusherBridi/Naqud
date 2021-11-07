package Main;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.github.freva.asciitable.AsciiTable;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu mainMenu = new Menu("Main Menu", 3);
        mainMenu.set_menuButtonTitle(0, "Set up");
        mainMenu.set_menuButtonTitle(1, "Input");
        mainMenu.set_menuButtonTitle(2, "View");

        
        // Menu Logic:
        mainMenu.print();
        int userSelection = sc.nextInt();
        do {
            
            switch (userSelection) {
            case 1:
                System.out.println("Set up");
                Portfolio myPortfolio = Portfolio.userSetup(sc);
                myPortfolio.print();
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
            mainMenu.print();
            userSelection = sc.nextInt();
        } while (userSelection != 0);
        sc.close();
    }

    // Methods
    static void writeToFile(String fileName, Portfolio portfolio) {
        try {
            String finalName = fileName + ".csv";
            FileWriter writer = new FileWriter(finalName);
            writer.write("TEST");
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }

}
