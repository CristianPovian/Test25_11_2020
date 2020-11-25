import java.util.ArrayList;

public class Panel implements Sensors{

    public static enum Status{WORKING,NOTWORKING,PROTECTION};
    private ArrayList<Sensors> sensors = new ArrayList<>();
    private String name;
    private Status status;

    Panel(String name,Status status1){
        this.name=name;
        this.status=status1;
    }

    public void addContent(Sensors sensor){
        sensors.add(sensor);
    }

    public void print() {
        System.out.println("Panel name: "+this.name+" and it's sensors");
        for(Sensors i:sensors){
            i.print();
        }
    }
    public Panel.Status getStatus() {
        return status;
    }
    public void accept(Visitor v){
        v.visit(this);
        for(Sensors i:sensors){
            i.accept(v);
        }
    }
}


