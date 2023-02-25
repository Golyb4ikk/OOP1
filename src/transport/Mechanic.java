package transport;

public class Mechanic {
    private String nameSurname;
    private String company;

    public Mechanic(String nameSurname, String company) {
        this.nameSurname = nameSurname;
        this.company = company;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public<T extends Transport> void doMaintenance(T t){
        System.out.println(t.maintance()+getNameSurname()+" "+"провел техобслуживание");
    }
    public <T extends Transport>void repairCar(T t){
        System.out.println(t.repair()+getNameSurname()+" "+"машину починил");
    }
}
