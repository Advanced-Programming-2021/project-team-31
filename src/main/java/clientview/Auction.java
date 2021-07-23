package clientview;

import clientcontroller.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auction {
    private static Auction auction = null;

    private Auction() {

    }

    public static Auction getInstance() {
        if (auction == null)
            auction = new Auction();

        return auction;
    }
    Controller controller=Controller.getInstance();
    public void run()  {
        System.out.println("welcome to auction");
        while (true) {
            String input = MainClient.scanner.nextLine();
            Matcher matcher1 = getCommand(input, "^sell ([a-zA-Z\\s]+) price (\\d+)$");
            Matcher matcher2 = getCommand(input, "^show auctions$");
            Matcher matcher3 = getCommand(input, "^exit");
            Matcher matcher4 = getCommand(input, "^id (\\d+) price (\\d+)$");
            if(matcher1.find()){
                System.out.println(controller.addAuction(matcher1.group(1),matcher1.group(2)));
            }
            else if(matcher2.find()){
                System.out.println(controller.showAuction());
            }
            else if(matcher3.find())MenuHandler.runBack(Menu.SHOP);
            else if(matcher4.find()){
                System.out.println(controller.suggest(matcher4.group(1),matcher4.group(2)));
            }

            else System.out.println("invalid command");

        }
    }
    public Matcher getCommand(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }
}
