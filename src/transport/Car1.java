package transport;

public class Car1 extends Transport implements Competative   {
    public Car1(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void pitStop() {
        System.out.println("Стоп для легковушки");

    }

    @Override
    public void bestTimeRange() {
        System.out.println("Лучшее время круга для легковушки");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для легковушки");
    }
}
