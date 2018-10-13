package pl.sda.otomotospring.OtoMoto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class CreateCarRequest {

    @NotNull
    private String company;

    @NotNull
    private String model;

    @Min(1990)
    @Max(2018)
    private String year;

    @NotNull
    private String engine;

    @NotNull
    private String countryOfOrigin;

    @NotNull
    private String mileage;

    @NotNull
    private String colour;
}
