package web.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "toyota", 2020));
        carList.add(new Car("Honda", "honda", 2019));
        carList.add(new Car("Ford", "ford", 2021));
        carList.add(new Car("Chevrolet", "hz", 2018));
        carList.add(new Car("BMW", "323", 2022));
    }

    public List<Car> getCars(int count) {
        if (count >= carList.size() || count < 0) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }

}
