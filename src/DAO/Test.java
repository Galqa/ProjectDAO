/**
 * Створити прошарки Service та DAO для домену Car (id, model, modelYear).
 * Створити базу даних та таблицю.
 * За допомогою JDBC (PreparedStatement) написати insert, findById, update, deleteById, findAll методи для цього домену.
 */

package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


// Class Test використовує CarDAO та CarService для виконання операцій з базою даних.


public class Test {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionDB.getConnection();
        CarDAO carDAO = new CarDAO() {
            @Override
            public void insert(Car car) {

            }

            @Override
            public Car findById(int id) {
                return null;
            }

            @Override
            public void update(Car car) {

            }

            @Override
            public void deleteById(int id) {

            }

            @Override
            public List<Car> findAll() {
                return null;
            }
        };
        CarService carService = new CarService() {
            @Override
            public void insert(Car car) {

            }

            @Override
            public Car findById(int id) {
                return null;
            }

            @Override
            public void update(Car car) {

            }

            @Override
            public void deleteById(int id) {

            }

            @Override
            public List<Car> findAll() {
                return null;
            }
        };


    }
    }


