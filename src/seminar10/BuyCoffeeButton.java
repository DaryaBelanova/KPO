package seminar10;

public class BuyCoffeeButton {
    private Mediator mediator;

    private CoinState coins;
    private int price = 2;

    public BuyCoffeeButton(CoinState state, Mediator mediator) {
        coins = state;
        this.mediator = mediator;
    }

    public void buy() {
        if (coins.hasEnoughCoins(price))
            System.out.println("Preparing coffee...");
        else
            System.out.println("Not enough to buy coffee...");
        mediator.notifyy(this);
    }
}
