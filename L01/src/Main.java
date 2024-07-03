public class Main {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());

        Point2D b = new Point2D(0);
        System.out.println(b);

        // Point2D a = new Point2D();
        // a.x = 0;
        // a.y =2;
        // System.out.println(a.toString());
        //
        // Point2D b = new Point2D();
        // b.x = 0;
        // b.y=10;
        // System.out.println(b.toString());

        var dis = Point2D.distance(a, b);
        System.out.println(dis);

    }
}