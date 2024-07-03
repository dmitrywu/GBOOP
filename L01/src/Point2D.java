import com.sun.nio.sctp.SctpSocketOption;

/**
 * Это точка 2D
 */

public class Point2D {
    private int x, y;

    /**
     * Это конструктор ...
     * @param valueX координата X
     * @param valueY координата Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;

    }

    public Point2D(int value){
        this(value,value);
    }

    public Point2D(){
        this(0);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //    public Point2D() {
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value) {
//        x=value;
//        y=value;
//    }

    static double distance (Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x -b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    private String getInfo(){
        return String.format("x: %d; y: %d", x,y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}

