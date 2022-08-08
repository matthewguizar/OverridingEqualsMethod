public class Car {
    String make;
    String color;

    public Car(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public Car(Car source) {
        this.make = source.make;
        this.color = source.color;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        //checking if object is null
        if (obj == null){
            return false;
        }
        //checking if object is not an instance of Car
        if (!(obj instanceof Car)){
            return false;
        }
        //if it is Type casting object to car
        Car car = (Car)obj;
        //returning the comparison of all fields
        return this.make.equals(car.make) &&
        this.color.equals(car.color);
    }


}
