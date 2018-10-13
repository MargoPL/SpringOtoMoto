package pl.sda.otomotospring.OtoMoto.enums;

import java.util.Random;

public enum ColourEnum {
    BLACK, WHITE, GREEN, GOLD, SILVER, RED, BLUE;

    public static String getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)].toString();
    }
}
