package transport;

public class Bus extends Transport implements Competative{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Стоп для автобуса");

    }

    @Override
    public void bestTimeRange() {
        System.out.println("Лучшее время для автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшее время для автобуса");
    }
}
