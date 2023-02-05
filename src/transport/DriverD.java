package transport;

public class DriverD<T extends Bus> extends Driver {

    public DriverD(String fio, Boolean nalichiePrav, int experience) {
        super(fio, nalichiePrav, experience);
    }

    public void getInfo(T bus) {
        System.out.println("Водитель " + getFio() + " управляет автомобилем " + bus.getBrand() + "" + bus.getModel() + " и будет участвовать в заезде");
    }
}
