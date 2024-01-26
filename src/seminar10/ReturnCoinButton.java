package seminar10;

public class ReturnCoinButton {
    private Mediator mediator;
    private CoinState coins;

    public ReturnCoinButton(CoinState state, Mediator mediator) {
        coins = state;
        this.mediator = mediator;
    }

    public void returnCoins() {
        if (coins.hasEnoughCoins(1))
            System.out.println("Returning all coins...");
        else
            System.out.println("Machine has no coins to return...");
        mediator.notifyy(this);
    }

}
