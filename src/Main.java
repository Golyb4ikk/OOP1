import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "Yellow", 2015, "Russia","Y","Dif",12,11,new Car.Key(true,true));

        Car car2 = new Car("Audi", "A8", 3.0, "Black", 2020, "Germany","Y","Dif",12,11,new Car.Key(true,true));

        Car car3 = new Car("Kia", "Sport", 2.4, "Red", 2018, "East Corea","Y","Dif",12,11,new Car.Key(true,true));

        Car car4 = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "East Corea","Y","Dif",12,11,new Car.Key(true,true));

        Car car5 = new Car("Bmw", "z8", 3.0, "Black", 2021, "German","Y","Dif",12,11,new Car.Key(true,true));



        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}