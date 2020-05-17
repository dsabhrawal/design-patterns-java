package dp.creational.prototype;

public class PrototypeByCopyConstructor {
    public static void main(String[] args) {

        Line l1 = new Line(new Point(2,3),new Point(7,9));
        System.out.println(l1);
        Line l2 = new Line(l1);
        l2.start=new Point(4,5);
        System.out.println(l2);
    }
}

class Line{
    protected Point start;
    protected Point end;

    Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    //Copy Constructor
    Line(Line other){
        this.start = new Point(other.start);
        this.end = new Point(other.end);
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

class Point{
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Copy Constructor
    Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}