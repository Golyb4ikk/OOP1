public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;


   public Car(String brand,String model,double engineVolume,String color,int year,String country){
       this.brand=validateParam(brand);
       this.model=model;
       this.engineVolume=engineVolume;
       this.color=color;
       this.year=valYear(year);
       this.country=country;
   }
    public static Integer valYear(Integer value)
    {return value == null?2000:value;}


   public static String validateParam(String value) {
        return Validation.validateString(value,"default");
    }

    public static double validateEngineVolume(double value) {
        return value<0 ?1.5 :value;
    }
    public static String valColor(String value){
        return Validation.validateString(value,"default");
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

}
