package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {


   private List<Car> cars = List.of(
          new Car("Lada", "Vesta", 2020),
            new Car("UAZ", "Patriot", 2021),
            new Car("Moskvitch", "412", 1967),
            new Car("Zaporozhets", "ZAZ-968", 1972),
            new Car("Chaika", "GAZ-13", 1959)
    );

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0 || count > cars.size()) {
            return cars;  // Если количество некорректное, возвращаем весь список
        }
        //Метод subList() в Java используется для создания подсписка из существующего списка.subList(int fromIndex(включительно), int toIndex(не включая))
        return cars.subList(0, count);  // Возвращаем подсписок с нужным количеством машин
    }
}

