package day36_Inheritance.cryptoToken;

public class Cardano extends CryptoToken{
    public Cardano(double price, int quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }

    public String toString() {
        return "Cardano " + super.toString();
    }
}
