package transport;

import java.util.List;

public class Bus extends Transport implements Competative{

    Type type = Type.BUS;
    Capacity capacity=Capacity.BIG;

    public Bus(String brand, String model, double engineVolume, List<Mechanic> mechanicList, Capacity capacity) {
        super(brand, model, engineVolume, mechanicList);
        this.capacity = capacity;
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

    @Override
    public boolean isDiagPass() throws TransportTimeException {
        throw new TransportTimeException("Автобусы не проходят");
    }

    @Override
    public String repair() {
        return "Автобус отремонтирован";
    }

    @Override
    public String maintance() {
        return "Автобус прошел проверку,";
    }
}
