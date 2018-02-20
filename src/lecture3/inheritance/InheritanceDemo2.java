package lecture3.inheritance;

/**
 *
 * @author AD-Rahat
 */
class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class WeightedRectancle extends Box {

    double mass;

    WeightedRectancle(double w, double h, double d, double m) {
        super(w, h, d);
        mass = m;
    }
}

public class InheritanceDemo2 {

    public static void main(String[] args) {
        WeightedRectancle ob = new WeightedRectancle(10.0, 20.0, 30.0, 40.0);

        System.out.println(ob.width + " " + ob.height + " " + ob.depth + " " + ob.mass);
    }
}
