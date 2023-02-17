import transport.*;

import static transport.Capacity.*;
import static transport.Carcase.*;
import static transport.WeightUp.*;

public class Main  {
    public static void main(String[] args) {
        Car1 audi=new Car1("Audi","a1",12.5, SEDAN);
        Car1 audi1=new Car1("Audi1","a2",13.5, CUPE);
        Car1 audi2=new Car1("Audi2","a3",15.5, CROSSOVER);
        Car1 audi3=new Car1("Audi3","a4",16.5, FURGON);
        Bus bmw=new Bus("BMW","b1",15.3, BIG);
        Bus bmw1=new Bus("BMW1","b2",16.3, VERYSMALL);
        Bus bmw2=new Bus("BMW2","b3",17.3, VERYBIG);
        Bus bmw3=new Bus("BMW3","b4",18.3, NORM);
        Autotrack tracktor= new Autotrack("Kalendula","c1",142.2, N3);
        Autotrack tracktor1= new Autotrack("Kalendula1","c2",1512.2, N1);
        Autotrack tracktor2= new Autotrack("Kalendula2","c3",162.2, N1);
        Autotrack tracktor3= new Autotrack("Kalendula3","c4",172.2, N1);

        audi1.bestTimeRange();
        audi2.bestTimeRange();
        audi3.bestTimeRange();
        audi.maxSpeed();
        audi.pitStop();
        bmw.bestTimeRange();
        bmw.pitStop();
        bmw.maxSpeed();
        tracktor2.bestTimeRange();
        tracktor1.pitStop();
        tracktor3.maxSpeed();


        DriverD man= new DriverD("G.A.S",true,12);
        man.getInfo(bmw);

        DriverC man1= new DriverC("B.A.D",true,13);
        man1.getInfo(tracktor1);

        DriverB man2= new DriverB("G.A.D",true,14);
        man2.getInfo(audi1);

        audi1.printType();
        tracktor1.printType();


    }

}