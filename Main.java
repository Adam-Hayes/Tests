package Exercise;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"Alex",123456789);

        Tower t1 = new Tower(3,4600);
        Tower t2 = new Tower(4,7200);
        Tower t3 = new Tower(2,7800);
        Call call = new Call();
        double x = call.findX(t1,t2);
        double y = call.findY(t1,t3);
        Coordinates coord = new Coordinates(x,y);
        List <Coordinates> coordinates = new ArrayList<>();
        coordinates.add(coord);
        System.out.println(coordinates.toString());

    }
}
