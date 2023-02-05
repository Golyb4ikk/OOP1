package transport;

public class DriverB<T extends Car1> extends Driver{
    public DriverB(String fio, Boolean nalichiePrav, int experience) {
        super(fio, nalichiePrav, experience);
    }
    public void getInfo(T car1) {
        System.out.println("Водитель " + getFio() + " управляет автомобилем " + car1.getBrand() + " " + car1.getModel() + " и будет участвовать в заезде");
    }
}
