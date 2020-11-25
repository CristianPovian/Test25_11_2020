public interface Visitor {

    void visit(Panel p);
    void visit(Proximity proximity);
    void visit(Lidar l);
    void visit(Camera c);
    void visit(Temperature t);


}
