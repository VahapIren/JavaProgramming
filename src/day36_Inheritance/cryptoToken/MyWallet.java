package day36_Inheritance.cryptoToken;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin1=new Bitcoin(1500,20,28,100000,55,true);
        Etherum etherum1=new Etherum(1250,15,18,75000,48,true);
        Cardano cardano1=new Cardano(750,30,12,45000,45,true);
        Double totalAsset= bitcoin1.totalPrice()+ etherum1.totalPrice()+cardano1.totalPrice();

        System.out.println(bitcoin1);
        System.out.println(etherum1);
        System.out.println(cardano1);
        System.out.println(totalAsset+"$");


    }
}
