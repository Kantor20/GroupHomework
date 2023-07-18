package pl.kurs.person.service;

import pl.kurs.person.model.Car;

import java.util.*;

public class CarService {

    public Car youngestCar(List<Car> list) {
        return Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(Car::getAge))
                .orElse(null);
    }

    public List<Car> carByProducer(List<Car> list, String producer) {
        return Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull)
                .filter(c -> c.getProducer() != null)
                .filter(c -> c.getProducer().equals(producer))
                .toList();
    }
}
