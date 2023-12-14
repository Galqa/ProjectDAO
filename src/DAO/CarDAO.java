package DAO;

import java.util.List;


// Інтерфейс, який визначає методи для роботи з базою даних для сутності Car
public interface CarDAO {
    public void insert(Car car);

    public Car findById(int id);

    public void update(Car car);

    public void deleteById(int id);

    public List<Car> findAll();
}
