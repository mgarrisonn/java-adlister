import java.util.ArrayList;
import java.util.List;

public class ListCarsDao implements Cars {
    private List<Car> cars;

    @Override
    public List<Car> all() {
        if(cars == null){
           cars = generateCars();
        }
        return cars;
    }

    private List<Car> generateCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(
                1,
                "Ford",
                "F-150",
                2015

        ));
        return cars;
    }

}
