package racingcar;

import java.util.List;
import java.util.Arrays;

class Stadium {
    int first_pos;
    List<Car> cars;

    public stadium() {
        first_pos = 0;
        cars = new List<>();
    }

    public void carsEnter(String line) throws IllegalArgumentException{
        carNames = Arrays.asList(line.split(","));
        for (String name : carNames) {
            validateName(name);
            cars.add(new Car(name))
        }
    }

    private static void validateName(String string) throws IllegalArgumentException {
        if(string.length()>5){
            throw new IllegalArgumentException();
        }
    }

    public void race() {

    }

    public void getStatus() {

    }

    public void winner() {

    }


}