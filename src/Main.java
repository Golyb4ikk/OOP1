public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setBrand("Lada");
        car1.setColor("Yellow");
        car1.setCountry("Russia");
        car1.setModel("Granta");
        car1.setEngineVolume(1.7);
        car1.setYear(2015);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setColor("Black");
        car2.setCountry("Germany");
        car2.setModel("A8");
        car2.setEngineVolume(3.0);
        car2.setYear(2020);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setBrand("Kia");
        car3.setColor("Red");
        car3.setCountry("East Corea");
        car3.setModel("Sport");
        car3.setEngineVolume(2.4);
        car3.setYear(2018);
        System.out.println(car3);

        Car car4 = new Car();
        car4.setBrand("Hyundai");
        car4.setColor("Orange");
        car4.setCountry("East Corea");
        car4.setModel("Avante");
        car4.setEngineVolume(1.6);
        car4.setYear(2016);
        System.out.println(car4);

        Car car5 = new Car();
        car5.setBrand("Bmw");
        car5.setColor("Black");
        car5.setCountry("German");
        car5.setModel("z8");
        car5.setEngineVolume(3.0);
        car5.setYear(2021);
        System.out.println(car5);

    }
}