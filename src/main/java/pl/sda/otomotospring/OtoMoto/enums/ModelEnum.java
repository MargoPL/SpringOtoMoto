package pl.sda.otomotospring.OtoMoto.enums;

import java.util.Random;

public enum ModelEnum {
    AURIS, E46, RX8, ASTRA, XC60, FOCUS, GOLF;

    public static String getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)].toString();
    }
}
