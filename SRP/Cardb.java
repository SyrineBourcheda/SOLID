package com.directi.training.srp.exercise.refactored;

import java.util.Arrays;
import java.util.List;

import com.directi.training.srp.exercise.Car;

public class Cardb {
          
	 private List<Car> cars = Arrays.asList(
		        new Car("1", "Golf III", "Volkswagen"),
		        new Car("2", "Multipla", "Fiat"),
		        new Car("3", "Megane", "Renault")
		    );

	
		    public Car getFromDb(final String carId)
		    {
		        for (Car car : cars) {
		            if (car.getId().equals(carId)) {
		                return car;
		            }
		        }
		        return null;
		    }
		    public Car getBestCar()
		    {
		        Car bestCar = null;
		        for (Car car : cars) {
		            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
		                bestCar = car;
		            }
		        }
		        return bestCar;
		    }

		   /* public List<Car> getAllCars() {
		        return cars;
		    }*/

		
}
