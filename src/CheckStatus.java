public class CheckStatus implements Visitor{

    int panelsworking=0, panelsnotworking=0, panelsinprotection=0;
    int camerassworking=0, camerasnotworking=0, camerasinprotection=0;
    int proximitysworking=0, proximitysnotworking=0, proximitysinprotection=0;
    int lidarsworking=0, lidarsnotworking=0, lidarsinprotection=0;
    int tempsworking=0, tempsnotworking=0, tempsinprotection=0;

    public void visit(Panel p) {
        if(p.getStatus()== Panel.Status.NOTWORKING){
            panelsnotworking++;
        }else if(p.getStatus()==Panel.Status.WORKING){
            panelsworking++;
        }else if(p.getStatus()==Panel.Status.PROTECTION){
            panelsinprotection++;
        }
    }
    public void visit(Proximity proximity) {
        if(proximity.getStatus()== Panel.Status.NOTWORKING){
            proximitysnotworking++;
        }else if(proximity.getStatus()==Panel.Status.WORKING){
            proximitysworking++;
        }else if(proximity.getStatus()==Panel.Status.PROTECTION){
            proximitysinprotection++;
        }
    }
    public void visit(Lidar l) {
        if(l.getStatus()== Panel.Status.NOTWORKING){
            lidarsnotworking++;
        }else if(l.getStatus()==Panel.Status.WORKING){
            lidarsworking++;
        }else if(l.getStatus()==Panel.Status.PROTECTION){
            lidarsinprotection++;
        }
    }
    public void visit(Camera c) {
        if(c.getStatus()== Panel.Status.NOTWORKING){
            camerasnotworking++;
        }else if(c.getStatus()==Panel.Status.WORKING){
            camerassworking++;
        }else if(c.getStatus()==Panel.Status.PROTECTION){
            camerasinprotection++;
        }
    }
    public void visit(Temperature t) {
        if(t.getStatus()== Panel.Status.NOTWORKING){
            tempsnotworking++;
        }else if(t.getStatus()==Panel.Status.WORKING){
            tempsworking++;
        }else if(t.getStatus()==Panel.Status.PROTECTION){
            tempsinprotection++;
        }
    }

    public void printStatus(){
        System.out.println(panelsworking+" panels are working, "+panelsnotworking+" are not working, and in protection: "+panelsinprotection);
        System.out.println(camerassworking+" cameras are working, "+camerasnotworking+" are not working, and in protection: "+camerasinprotection);
        System.out.println(tempsworking+" temp sensors are working, "+tempsnotworking+" are not working, and in protection: "+tempsinprotection);
        System.out.println(lidarsworking+" lidars are working, "+lidarsnotworking+" are not working, and in protection: "+lidarsinprotection);
        System.out.println(proximitysworking+" proxi sensors are working, "+proximitysnotworking+" are not working, and in protection: "+proximitysinprotection);
    }
}
