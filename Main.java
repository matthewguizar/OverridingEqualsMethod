public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "blue");
        Car sameCar = new Car(car);// when saved as a copy they have different reference
        //equals method checks if they share the same reference
        //can override equals method to check for same fields.
        System.out.println(car.equals(sameCar));
    }

}
