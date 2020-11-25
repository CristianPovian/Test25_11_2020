public class Main {

    public static void main(String[] args){
        Panel p1=new Panel("Panel1", Panel.Status.NOTWORKING);
        Panel p2=new Panel("Panel2", Panel.Status.WORKING);
        Panel p3=new Panel("Panel3", Panel.Status.PROTECTION);
        p1.addContent(p2);
        p1.addContent(p3);
        Camera c1=new Camera("Camera1", Panel.Status.PROTECTION);
        Proximity prox1=new Proximity("Prox1", Panel.Status.NOTWORKING);
        Temperature t1=new Temperature("Temp1", Panel.Status.WORKING);
        Lidar l1=new Lidar("Lidar1", Panel.Status.NOTWORKING);
        Camera c2=new Camera("Camera2", Panel.Status.WORKING);
        p2.addContent(c1);
        p2.addContent(prox1);
        p3.addContent(t1);
        p3.addContent(l1);
        p1.addContent(c2);
        p1.print();

        CheckStatus checkStatus=new CheckStatus();
        p1.accept(checkStatus);
        checkStatus.printStatus();

    }

}
