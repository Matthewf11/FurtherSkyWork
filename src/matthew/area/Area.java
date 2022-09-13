package matthew.area;

public class Area {

    private int length;
    private int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea(int bre,int len){
        return bre*len;
    }
}
