package transport;

public class Validation {
    public static String validateString(String value, String defaultValue) {
        return (value == null || value.isBlank() || value.isEmpty()) ? defaultValue : value;
    }

    public static int valInt(Integer value) {
        return value == null || value < 0 ? 0 : value;
    }

    public static Boolean valBool(Boolean value){ return value!=null && value;}



}
