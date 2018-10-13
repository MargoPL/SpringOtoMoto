package pl.sda.otomotospring.OtoMoto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class HomeController {

    private CarService carService;

    @Autowired
    public HomeController(CarService carService) {
        this.carService = carService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/home")
    public void createCar(@RequestBody @Valid CreateCarRequest request) {
        carService.createCar(request);
    }

    @GetMapping("/home1/{carId}")
    public Car getPersonById(@PathVariable(name = "carId") String id) {
        return carService.getCarById(id);
    }

    @GetMapping("/home2")
    public List<Car> getCarList() {
        return carService.retrieveCars();
    }

    @DeleteMapping("/home3/{carId}")
    public List<Car> newCarList(@PathVariable(name = "carId") String id) {
        return carService.removeCarFromListById(id);
    }

    @PutMapping("home4/{carId}")
    public Car updatedCar(@RequestBody @Valid UpdateCarRequest updateCarRequest, @PathVariable(name = "carId") String id) {
        return carService.updateStatistic(id, updateCarRequest);
    }

    @GetMapping("/random")
    public List<Car> getRandomCarList() {
        return carService.retrieveRandomCars();
    }

    @GetMapping("/home5/{company},{model}")
    public List<Car> getSelectedCar(@PathVariable(name = "company") String company, @PathVariable(name = "model") String model) {
        return carService.getSelectedCar(model, company);
    }
}