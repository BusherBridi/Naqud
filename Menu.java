import java.util.Scanner;

public class Menu {
    String displayHeader;
    String[] menuButtons;
    int numOfChoices;

    // Constructor (Menu title to be displayed, number of choices to display)
    public Menu(String title, int numOfChoices) {
        this.displayHeader = "~~~~~~~~~~~~~" + title + "~~~~~~~~~~~~~";
        this.menuButtons = new String[numOfChoices];
        this.numOfChoices = numOfChoices;
        for (int i = 0; i < numOfChoices; i++) {
            menuButtons[i] = String.valueOf(i + 1) + ") ";
        }
    }

    public String get_displayHeader() {
        return (displayHeader);
    }

    public String[] get_menuButtons() {
        return (menuButtons);
    }

    public void set_menuButtonTitle(int buttonNumber, String title) {
        menuButtons[buttonNumber] = menuButtons[buttonNumber] + title;
    }

    public void print() {
        System.out.println(displayHeader);
        for (int i = 0; i < numOfChoices; i++) {
            System.out.println(menuButtons[i]);
        }
        System.out.println("0) Exit");
    }
}
