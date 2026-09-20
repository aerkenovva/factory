package gui;

public class MainGUI {
    public static void main(String[] args) {
        System.out.println("--- Mac OS App ---");
        GUIFactory macFactory = new MacOSFactory();
        Application macApp = new Application(macFactory);
        macApp.paint();

        System.out.println("\n--- Windows OS App ---");
        GUIFactory winFactory = new WindowsFactory();
        Application winApp = new Application(winFactory);
        winApp.paint();
    }
}
