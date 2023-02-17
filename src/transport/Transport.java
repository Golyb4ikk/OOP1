package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private boolean isDiagPass;

    private double engineVolume;

    private Type type;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;


    }

    public void startDrive() {
        System.out.println("Начать движение");
    }

    public void finishDrive() {
        System.out.println("Закончить движение");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract Type getType();

    public abstract void printType();

    public boolean isDiagPass() throws TransportTimeException {
        return isDiagPass;
    }
}
