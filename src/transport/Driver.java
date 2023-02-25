package transport;

public class Driver {
    private String fio;
    private Boolean nalichiePrav;
    private int experience;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Boolean getNalichiePrav() {
        return nalichiePrav;
    }

    public void setNalichiePrav(Boolean nalichiePrav) {
        this.nalichiePrav = nalichiePrav;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return  fio+" "+nalichiePrav+" "+experience;
    }

    public Driver(String fio, Boolean nalichiePrav, int experience) {
        this.fio = fio;
        this.nalichiePrav = nalichiePrav;
        this.experience = experience;




    }

    void stopDriving(){
        System.out.println("Остановиться");
    }
    void startDriving(){
        System.out.println("Начать движение");
    }
    void refuelAuto(){
        System.out.println("Заправить авто");
    }
}
