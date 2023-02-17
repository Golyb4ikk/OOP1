public class Validation {
    public static String validateString(String value,String defaultValue){
        return(value==null || value.isBlank() || value.isEmpty()) ? defaultValue : value;
    }
    public static Integer valInt(Integer value){
        return value==null || value<0 ? 0 : value;
    }
}
