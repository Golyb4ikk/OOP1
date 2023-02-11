package transport;

public class Autotrack extends Transport implements Competative{

    Type type=Type.AUTOTRACK;
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

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void printType() {
        if(getType() == null){
            System.out.println("Нет данных");
        }else{
            System.out.println(getType());
        }
    }
}
