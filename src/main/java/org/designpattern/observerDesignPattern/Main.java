package org.designpattern.observerDesignPattern;

public class Main {

    public static void main(String[] args) {
        Observer tvDisplay = new TVDisplay();
        Observer phoneDisplay = new PhoneDisplay();
        NatGeo natGeo = new NatGeo();
        natGeo.addObserver(tvDisplay);
        natGeo.setLatestNews("New species discovered in the Amazon Rainforest!");
        NDTV ndtv = new NDTV();
        ndtv.addObserver(phoneDisplay);
        ndtv.addObserver(tvDisplay);
        ndtv.setLatestNews("India wins Cricket World Cup!");
        ndtv.setLatestNews("Breaking: Heavy rains expected in Mumbai!");
    }
}
