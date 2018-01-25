package Exercise;

public class Call {
    public final double c = 10000;
    private int id;
    private int time;

    public Call() {
    }

    public double findX(Tower t1, Tower t2) {
        //первый треугольник
        double a = t1.getDistance();
        double b = t2.getDistance();


        double p1 = (a + b + c) / 2;
        double S1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        double h1 = S1 / (0.5 * c);


        if (t1.getId() == 3 || t1.getId() == 4) {
            h1 = 10000 - h1;
        }
        double h1Round = Math.round(h1);

        return h1Round;
    }

    public double findY(Tower t1, Tower t3) {
        // второй треугольник
        double a = t1.getDistance();
        double d = t3.getDistance();
        double p2 = (a + d + c) / 2;
        double S2 = Math.sqrt(p2 * (p2 - a) * (p2 - d) * (p2 - c));
        double h2 = S2 / (0.5 * c);
        if (t1.getId() == 3 || t1.getId() == 4) {
            h2 = 10000 - h2;
        }
        double h2Round = Math.round(h2);
        return h2Round;
    }
}