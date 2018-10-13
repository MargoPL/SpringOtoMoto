package pl.sda.otomotospring.OtoMoto;

import pl.sda.otomotospring.OtoMoto.enums.ColourEnum;
import pl.sda.otomotospring.OtoMoto.enums.CompanyEnum;
import pl.sda.otomotospring.OtoMoto.enums.ModelEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarGenerator {

    public static List<Car> createRandomCar() {

        List<Car> randomCarList = new ArrayList();

        for (int i = 0; i < 100; i++) {
            Car car = Car.builder()
                    .company(CompanyEnum.getRandomCompany())
                    .model(ModelEnum.getRandomColor())
                    .year(Integer.toString(RandomNumberGenerator.randomWithRange(1990,2018)))
                    .engine(Integer.toString(RandomNumberGenerator.randomWithRange(2,5))+"."+Integer.toString(RandomNumberGenerator.randomWithRange(0,9)))
                    .countryOfOrigin(CompanyEnum.getRandomCompany())
                    .mileage(Integer.toString(RandomNumberGenerator.randomWithRange(100_000,250_000)))
                    .colour(ColourEnum.getRandomColor())
                    .id(UUID.randomUUID().toString())
                    .build();
            randomCarList.add(car);
        }
        return randomCarList;
    }
}
