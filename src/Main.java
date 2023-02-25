import transport.*;

import java.util.*;

import static transport.Capacity.*;
import static transport.Carcase.*;
import static transport.WeightUp.N1;
import static transport.WeightUp.N3;

public class Main {
    public static void main(String[] args) {
        Mechanic Alex = new Mechanic("Alex.G", "KKk");
        Mechanic Ivan = new Mechanic("Alex.V", "KKL");
        Mechanic Alex2 = new Mechanic("Alex.Z", "KKZ");
        Mechanic Alex3 = new Mechanic("Alex.D", "KKD");
        Car1 audi = new Car1("Audi", "a1", 12.5, List.of(Alex), SEDAN);
        Car1 audi1 = new Car1("Audi1", "a2", 13.5, List.of(Ivan), CUPE);
        Car1 audi2 = new Car1("Audi2", "a3", 15.5, List.of(Alex2), CROSSOVER);
        Car1 audi3 = new Car1("Audi3", "a4", 16.5, List.of(Alex3), FURGON);
        Bus bmw = new Bus("BMW", "b1", 15.3, List.of(Alex2), BIG);
        Bus bmw1 = new Bus("BMW1", "b2", 16.3, List.of(Alex3), VERYSMALL);
        Bus bmw2 = new Bus("BMW2", "b3", 17.3, List.of(Alex2), VERYBIG);
        Bus bmw3 = new Bus("BMW3", "b4", 18.3, List.of(Alex2), NORM);
        Autotrack tracktor = new Autotrack("Kalendula", "c1", 142.2, List.of(Alex2), N3);
        Autotrack tracktor1 = new Autotrack("Kalendula1", "c2", 1512.2, List.of(Alex3), N1);
        Autotrack tracktor2 = new Autotrack("Kalendula2", "c3", 162.2, List.of(Alex2), N1);
        Autotrack tracktor3 = new Autotrack("Kalendula3", "c4", 172.2, List.of(Ivan), N1);

        List<Transport> machine = new ArrayList<>();
        machine.add(audi);
        machine.add(audi1);
        machine.add(audi2);
        machine.add(audi3);
        machine.add(bmw);
        machine.add(bmw1);
        machine.add(bmw2);
        machine.add(bmw3);
        machine.add(tracktor);
        machine.add(tracktor1);
        machine.add(tracktor2);
        machine.add(tracktor3);

        Queue<Transport> transportsOnSTO = new ArrayDeque<>();
        ServiceCentre sto = new ServiceCentre(transportsOnSTO);
        for (Transport transport : machine) {
            sto.addTrans(transport);
        }
        for (int j = 0; j < transportsOnSTO.size(); j++) {
            sto.queueSto(transportsOnSTO);
        }

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
        DriverD man = new DriverD("G.A.S", true, 12);
        man.getInfo(bmw);

        DriverC man1 = new DriverC("B.A.D", true, 13);
        man1.getInfo(tracktor1);

        DriverB man2 = new DriverB("G.A.D", true, 14);
        man2.getInfo(audi1);
        audi1.printType();
        tracktor1.printType();
        audi1.isDiagPass();
        tracktor1.isDiagPass();
        //bmw1.isDiagPass();
        Alex3.repairCar(tracktor1);
        Ivan.doMaintenance(audi1);

        Map<Transport,List<Mechanic>>trAndMech=new HashMap<>();

        trAndMech.put(audi1,audi1.getMechanicList());
        trAndMech.put(bmw,bmw.getMechanicList());
        trAndMech.put(tracktor3,tracktor3.getMechanicList());

        for (Map.Entry<Transport,List<Mechanic>> map:trAndMech.entrySet()){
            System.out.println(map);
        }

        Set<Driver>drSet=new HashSet<>();
        List<Driver>drivers=new ArrayList<>();
        drivers.add(man1);
        drivers.add(man2);

        for(Driver driver:drivers){
            drSet.add(driver);
        }

        Iterator<Driver>iterator=drSet.iterator();
        Driver driver=iterator.next();
        System.out.println(driver);
    }

}