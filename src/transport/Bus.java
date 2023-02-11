package transport;

public class Bus extends Transport implements Competative{

    Type type = Type.BUS;
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
