package Exercise;

public class Tower {
    private int id;
    private  double distance;

    public Tower(int id) {
        this.id = id;
    }

    public Tower(int id, double distance) {
        this.id = id;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}


