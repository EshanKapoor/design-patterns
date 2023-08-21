package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory factory;

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        Point point1 = new Point(20, 30, factory.getPointIcon(PointType.CAFE));
        Point point2 = new Point(40, 10, factory.getPointIcon(PointType.HOSPITAL));
        points.add(point1);
        points.add(point2);
        return points;
    }
}
