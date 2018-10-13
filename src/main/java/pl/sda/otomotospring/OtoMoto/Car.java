package pl.sda.otomotospring.OtoMoto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Car {

    private String id;

    private String company;

    private String model;

    private String year;

    private String engine;

    private String countryOfOrigin;

    private String mileage;

    private String colour;
}
