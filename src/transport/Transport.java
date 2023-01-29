package transport;

public class Transport {

    private  String brand;

    private  String model;

    private int maxSpeed;

    private String color;

    private final int year;

    private final  String country;

    public Transport(String brand, String model, int maxSpeed, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public static String validateParam(String value) {
        return Validation.validateString(value, "default");
    }
    public static int valInt(Integer value) {
        return value == null || value < 0 ? 0 : value;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = valInt(maxSpeed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateParam(color);
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }


}
