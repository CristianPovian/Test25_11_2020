public class Camera implements Sensors{

    private String name;
    private Panel.Status status;

    Camera(String name, Panel.Status status){
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
        System.out.println("Camera sensor name: "+name);
    }
}
