package transport;

import java.util.List;

public abstract class Transport {

    private String brand;
    private String model;
    private boolean isDiagPass;

    private double engineVolume;

    private Type type;

    private List<Mechanic>mechanicList;

    public Transport(String brand, String model, double engineVolume, List<Mechanic>mechanicList) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mechanicList=mechanicList;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
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
    public abstract String repair();
    public abstract String maintance();

    public boolean checkTrans(){
        try{
            isDiagPass();
        }catch (TransportTimeException e){
            return false;
        }
        return true;
    }
}
