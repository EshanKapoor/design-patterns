package structural.flyweight;

public class Point {
    private int x;
    private int y;
    private PointIcon pointIcon;

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    public void draw() {
        System.out.printf("%s at (%d,%d)\n", pointIcon.getPointType(), x, y);
    }

}
