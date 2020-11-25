public class Temperature implements Sensors{

    private String name;
    private Panel.Status status;

    Temperature(String name, Panel.Status status){
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
        System.out.println("Temperature sensor name: "+name);
    }
}
