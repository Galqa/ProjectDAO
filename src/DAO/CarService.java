package DAO;

import java.util.List;

public interface CarService {
     void insert(Car car);
     Car findById(int id);
     void update(Car car);
     void deleteById(int id);
     List<Car> findAll();
}
