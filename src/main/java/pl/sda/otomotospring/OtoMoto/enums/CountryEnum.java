package pl.sda.otomotospring.OtoMoto.enums;

import java.util.Random;

public enum CountryEnum {
    GERMANY, POLAND, FRANCE;

    public static String getRandomCountry() {
        Random random = new Random();
        return values()[random.nextInt(values().length)].toString();
    }
}
