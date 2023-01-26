package transport;


import static transport.Validation.*;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmiss;
    private  String carcass;
    private int numberReg;
    private  int numbSeat;
    private boolean sumRubber;

    private Key key;

    int month = 4;


    public static class Key {

        private Boolean isKeyInCar;
        private  Boolean distanceKeyEngine ;
        private  Boolean keylessAccess ;

        public void whereKey(Boolean isKeyInCar){

            if (isKeyInCar == true) {
                System.out.println("Ключ в машине");
            }else{
                System.out.println("Ключ нужно вставить в машину");
            }
        }
        public Key(Boolean distanceKeyEngine, Boolean keylessAccess) {

            this.distanceKeyEngine = valBool(distanceKeyEngine);
            this.keylessAccess = valBool(keylessAccess);

        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,String transmiss,String carcass,int numberReg,int numbSeat,Key key) {
        this.brand = validateParam(brand);
        this.model = validateParam(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = valColor(color);
        this.year = valYear(year);
        this.country = validateParam(country);
        this.transmiss = validateParam(transmiss);
        this.carcass = validateParam(carcass);
        this.numberReg = valNumberReg(numberReg);
        this.numbSeat = valNumbSeat(numbSeat);
        this.key=key;

    }

    public void changeRub(boolean sumRubber) {
        if (month == 1 || month == 12 || month == 2) {
            sumRubber = true;
        } else {
            sumRubber = false;
        }

    }

    public static Integer valYear(Integer value) {
        return value == null ? 2000 : value;
    }

    public static String validateParam(String value) {
        return Validation.validateString(value, "default");
    }

    public static double validateEngineVolume(double value) {
        return value < 0 ? 1.5 : value;
    }

    public static String valColor(String value) {
        return validateString(value, "default");
    }

    public static Integer valNumberReg(Integer value) {
        return value == null ? 60 : value;
    }

    public static Integer valNumbSeat(Integer value) {
        return value == null ? 50 : value;
    }


    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", engineVolume=" + engineVolume +
                        ", color='" + color + '\'' +
                        ", year=" + year +
                        ", country='" + country + '\'';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = valColor(color);
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmiss() {
        return transmiss;
    }

    public void setTransmiss(String transmiss) {
        this.transmiss = validateParam(transmiss);
    }

    public String getCarcass() {
        return carcass;
    }

    public int getNumberReg() {
        return numberReg;
    }

    public void setNumberReg(int numberReg) {
        this.numberReg = valNumberReg(numberReg);
    }

    public int getNumbSeat() {
        return numbSeat;
    }

    public boolean isSumOrWintRubber() {
        return sumRubber;
    }

}
