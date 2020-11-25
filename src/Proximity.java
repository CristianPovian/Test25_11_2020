public class Proximity implements Sensors{

    private String name;
    private Panel.Status status;

    Proximity(String name, Panel.Status status){
        this.name=name;
        this.status=status;
    };

    public void accept(Visitor v){
        v.visit(this);
    }

    public Panel.Status getStatus() {
        return status;
    }

    public void print() {
        System.out.println("Proximity sensor name: "+name);
    }
}
