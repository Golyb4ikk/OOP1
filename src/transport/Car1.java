package transport;

public class Car1 extends Transport implements Competative   {

    Type type=Type.CAR1;
    Carcase carcase=Carcase.SEDAN;
    public Car1(String brand, String model, double engineVolume,Carcase carcase) {
        super(brand, model, engineVolume);
        this.carcase=carcase;
    }

    public Carcase getCarcase() {
        return carcase;
    }

    public void setCarcase(Carcase carcase) {
        this.carcase = carcase;
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

    @Override
    public String toString() {
        System.out.println(12);
        return super.toString();
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
}
