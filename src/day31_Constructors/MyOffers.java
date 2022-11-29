package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        Offer offer2=new Offer();
        Offer offer3=new Offer();
        Offer offer4=new Offer();
        Offer offer5=new Offer();
        offer1.setInfo("VA","Amazon Inc.","SDET",110000,true,true,true,true);
        offer2.setInfo("CA","Sony Inc.","QA",120000,true,false,false,true);
        offer3.setInfo("FL","Apple Inc.","QE",125000,true,true,true,false);
        offer4.setInfo("TX","CapitalOne","SM",115000,false,false, true,true);
        offer5.setInfo("WA","Bank Of America","BA",130000,true,true,false,true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer> fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime);
        System.out.println("fullTimeOffers = " + fullTimeOffers.size());

        ArrayList<Offer> localeOffers=new ArrayList<>(Arrays.asList(myOffers));
        localeOffers.removeIf(p->!(p.location.equals("VA")||p.location.equals("CA")));
        System.out.println(localeOffers.size());

        ArrayList<Offer> offersWithBenefits=new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p->!(p.hasBenefit&&p.hasPTO));
        System.out.println("offersWithBenefits = " + offersWithBenefits.size());

        ArrayList<Offer> sdetOffers=new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p->!p.jobTitle.equals("SDET"));
        System.out.println("sdetOffers = " + sdetOffers.size());

        ArrayList<Offer> offersWith100K=new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p->!(p.salary>=100000));
        System.out.println("offersWith100K = " + offersWith100K.size());

        for (Offer localeOffer : localeOffers) {
            System.out.println(localeOffer.jobTitle+" : "+localeOffer.salary);
        }
        System.out.println("-----------------------------");



    }

}
