package pl.sda.otomotospring.OtoMoto;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Car> carList = new ArrayList();

    public void createCar(CreateCarRequest request) {
        Car car = Car.builder()
                .company(request.getCompany())
                .model(request.getModel())
                .year(request.getYear())
                .engine(request.getEngine())
                .countryOfOrigin(request.getCountryOfOrigin())
                .mileage(request.getMileage())
                .colour(request.getColour())
                .id(UUID.randomUUID().toString())
                .build();

        carList.add(car);
    }

    public List<Car> retrieveCars() {
        return carList;
    }

    public Car getCarById(String id) {
        Optional<Car> car = carList.stream().filter(e -> e.getId().equals(id)).findFirst();
        return car.orElseThrow(() -> new CarNotFoundException("Car with id " + id + " not found !"));
    }

    public List<Car> removeCarFromListById(String id) {
        Optional<Car> first = carList.stream().filter(e -> e.getId().equals(id)).findFirst();

        carList.remove(first.get());

        return carList;
    }

    public Car updateStatistic(String id, UpdateCarRequest updateCarRequest) {
        Car car = carList.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new CarNotFoundException("Car with id " + id + " not found !"));
        car.setYear(updateCarRequest.getYear());
        car.setMileage(updateCarRequest.getMileage());

        return car;
    }

    public List<Car> retrieveRandomCars() {
        return CarGenerator.createRandomCar();
    }

    public List<Car> getSelectedCar(String model, String company) {

        return carList.stream().filter(e -> e.getCompany().equals(company)).filter(e -> e.getModel().equals(model)).collect(Collectors.toList());

    }
}
