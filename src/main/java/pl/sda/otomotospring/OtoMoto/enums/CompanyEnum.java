package pl.sda.otomotospring.OtoMoto.enums;

import java.util.Random;

public enum CompanyEnum {
    FORD, TOYOTA, BMW, AUDI, MAZDA, VOLVO, OPEL;

    public static String getRandomCompany() {
        Random random = new Random();
        return values()[random.nextInt(values().length)].toString();
    }
}
