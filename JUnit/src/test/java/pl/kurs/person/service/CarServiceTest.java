package pl.kurs.person.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.kurs.person.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CarServiceTest {

    private CarService service;
    private Car car1;
    private Car car2;
    private Car car3;
    private Car car4;

    private List<Car> cars;

    @Before
    public void init() {
        service = new CarService();

        car1 = new Car("bmw", 15);
        car2 = new Car("audi", 14);
        car3 = new Car("bmw", 18);
        car4 = new Car("toyota", 13);

        cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));
    }

    @Test
    public void shouldReturnYoungestCar() {
        Car youngest = car4;
        assertEquals(youngest, service.youngestCar(cars));
    }

    @Test
    public void shouldReturnNullWhenListIsNull() {
        List<Car> listForTest = null;
        assertNull(service.youngestCar(listForTest));
    }

    @Test
    public void shouldReturnAllBmws() {
        List<Car> bmw = new ArrayList<>(List.of(car1, car3));
        assertEquals(bmw, service.carByProducer(cars, "bmw"));
    }
}