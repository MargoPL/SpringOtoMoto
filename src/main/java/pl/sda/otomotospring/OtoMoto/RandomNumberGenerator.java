package pl.sda.otomotospring.OtoMoto;

import lombok.ToString;

@ToString
public class RandomNumberGenerator {

   public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
