package transport;

import java.util.Queue;

public class ServiceCentre {

    private Queue<Transport> queue;

    public ServiceCentre(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void addTrans(Transport transport){
        if(transport.checkTrans())
            queue.add(transport);
    }
    public void techIns(){
        if(!queue.isEmpty()){
            Transport transport=queue.poll();
            transport.repair();
        }
    }
    public void queueSto(Queue<Transport> queue){
        if(queue.isEmpty()){
            System.out.println("Нет механика");
        }else{
            for (int i = 0; i < queue.size() ; i++) {
                Transport curTr= queue.poll();

                Mechanic mechanic=curTr.getMechanicList().get(0);

            }
        }
    }
}
