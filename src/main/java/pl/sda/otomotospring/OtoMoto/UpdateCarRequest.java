package pl.sda.otomotospring.OtoMoto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class UpdateCarRequest {

    @NotNull
    private String year;

    @NotNull
    private String mileage;
}
