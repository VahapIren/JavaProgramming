package day36_Inheritance.cryptoToken;

public class Bitcoin extends CryptoToken{
    public Bitcoin(double price, int quantity, double marketCap, double volume, double circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }


    public String toString() {
        return "Bitcoin " + super.toString();
    }
}
