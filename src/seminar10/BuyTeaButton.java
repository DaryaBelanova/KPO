package seminar10;

public class BuyTeaButton {
    private Mediator mediator;
    private CoinState coins;
    private int price = 1;

    public BuyTeaButton(CoinState state, Mediator mediator) {
        coins = state;
        this.mediator = mediator;
    }

    public void buy() {
        if (coins.hasEnoughCoins(price))
            System.out.println("Preparing tea...");
        else
            System.out.println("Not enough to buy tea...");
        mediator.notifyy(this);
    }
}
