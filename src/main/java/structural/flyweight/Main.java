package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        PointIconFactory factory = new PointIconFactory();
        PointService pointService = new PointService(factory);
        for(Point point : pointService.getPoints()) {
            point.draw();
        }

    }
}
