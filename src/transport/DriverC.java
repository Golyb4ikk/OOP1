package transport;

public class DriverC<T extends Autotrack> extends Driver {
    public DriverC(String fio, Boolean nalichiePrav, int experience) {
        super(fio, nalichiePrav, experience);
    }

    public void getInfo(T autotrack) {
        System.out.println("Водитель " + getFio() + " управляет автомобилем " + autotrack.getBrand() + " " + autotrack.getModel() + " и будет участвовать в заезде");
    }
}
