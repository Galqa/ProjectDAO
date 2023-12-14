package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


// Клас який реалізує інтерфейс CarDAO
public class CarDAOImpl implements CarDAO {
    private Connection conn;

    public CarDAOImpl(Connection conn) {
        this.conn = conn;
    }

    //  додавання нового автомобіля
    @Override
    public void insert(Car car) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Car (model, modelYear) VALUES (?, ?)");
            ps.setString(1, car.getModel());
            ps.setInt(2, car.getModelYear());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //  пошук автомобіля за id

    @Override
    public Car findById(int id) {
        Car car = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Car WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                car = new Car(rs.getInt("id"), rs.getString("model"), rs.getInt("modelYear"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return car;
    }

    //  Метод  оновлення
    @Override
    public void update(Car car) {
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE Car SET model = ?, modelYear = ? WHERE id = ?");
            ps.setString(1, car.getModel());
            ps.setInt(2, car.getModelYear());
            ps.setInt(3, car.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // видалення автомобіля за іd
    @Override
    public void deleteById(int id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Car WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //  отримання всіх автомобілів
    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Car");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Car car = new Car(rs.getInt("id"), rs.getString("model"), rs.getInt("modelYear"));
                cars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }
}
