package day36_Inheritance.cryptoToken;

public class Etherum extends CryptoToken{
    public Etherum(double price, int quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }

    @Override
    public String toString() {
        return "Etherum " + super.toString();
    }
}
