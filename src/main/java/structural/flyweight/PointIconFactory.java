package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    Map<PointType, PointIcon> pointIconMap = new HashMap<>();

    public PointIcon getPointIcon(PointType pointType) {
        if (!pointIconMap.containsKey(pointType)) {
            PointIcon pointIcon = new PointIcon(pointType, null);
            pointIconMap.put(pointType, pointIcon);
        }
        return pointIconMap.get(pointType);
    }
}
