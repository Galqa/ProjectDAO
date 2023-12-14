package DAO;

import java.util.List;


// Клас, який реалізує інтерфейс CarService
public class CarServiceImpl implements  CarService {
    private final CarDAO carDAO;
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public void insert(Car car) {
        carDAO.insert(car);
    }

    @Override
    public Car findById(int id) {
        return carDAO.findById(id);
    }

    @Override
    public void update(Car car) {
        carDAO.update(car);
    }

    @Override
    public void deleteById(int id) {
        carDAO.deleteById(id);
    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }
}
