package seminar10;

public class Mediator {
    void notifyy(Object button) {
        if (button instanceof BuyCoffeeButton) {
            System.out.println("You bought coffee");
        }
        if (button instanceof  BuyTeaButton)  {
            System.out.println("You bought tea");
        }
        if (button instanceof ReturnCoinButton) {
            System.out.println("Money returned");
        }
    }
}
