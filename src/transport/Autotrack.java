package transport;

public class Autotrack extends Transport implements Competative{
    public Autotrack(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Стоп для грузового");
    }

    @Override
    public void bestTimeRange() {
        System.out.println("Лучшее время круга для грузового");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для грузового");
    }
}
