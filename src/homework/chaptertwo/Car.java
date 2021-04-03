package homework.chaptertwo;

public class Car {
    private int distance;
    private int fuel;
    private int fuelEfficiency;

    public Car(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        distance = 0;
        fuel = 0;
    }

    public void drive (int miles){
        if(miles > fuel*fuelEfficiency){
            distance += fuel*fuelEfficiency;
            fuel = 0;
        }
        else {
            distance += miles;
            fuel -= miles/fuelEfficiency;
        }
    }

    public void addFuel(int gallons) {
        fuel += gallons;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", fuel=" + fuel +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}
