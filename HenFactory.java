package com.company.lection5.homework;

public class HenFactory {
    public class Country{
        static String ukr = "Ukraine";
        static String rus = "Russia";
        static String mld = "Moldova";
        static String pol = "Poland";
    }
    static Hen getHen(String country) {
        Hen hen = null;
        switch (country) {
            case "Poland":
                return new PolishHen();
            case "Moldova":
                return new MoldovanHen();
            case "Russia":
                return new RussianHen();
            case "Ukraine":
                return new UkrainianHen();
            default:
                return hen;
        }
    }
    public static void main(String[] args) {
        Hen hen1 = HenFactory.getHen(Country.ukr);
        Hen hen2 = HenFactory.getHen(Country.rus);
        Hen hen3 = HenFactory.getHen(Country.pol);
        Hen hen4 = HenFactory.getHen(Country.mld);
        System.out.println(hen1.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());
        System.out.println(hen4.getDescription());

    }
}
