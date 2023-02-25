package transport;

import java.util.List;

public class Autotrack extends Transport implements Competative{

    Type type=Type.AUTOTRACK;
    WeightUp weightUp=WeightUp.N3;

    public Autotrack(String brand, String model, double engineVolume, List<Mechanic> mechanicList, WeightUp weightUp) {
        super(brand, model, engineVolume, mechanicList);
        this.weightUp = weightUp;
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

    @Override
    public boolean isDiagPass() throws TransportTimeException {
        return super.isDiagPass();
    }

    @Override
    public String repair() {
        return "Грузовик отремонтирован,";
    }

    @Override
    public String maintance() {
        return "Грузовик прошел проверку,";
    }
}
